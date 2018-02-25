package cz.vutbr.fit.core.io;

import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.model.Stop;
import cz.vutbr.fit.core.tools.Constant;
import cz.vutbr.fit.core.tools.Location;
import kotlin.Pair;
import org.apache.commons.lang.StringUtils;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StationsParser {

    /**
     * Process file containing information about different stations:
     **
     * @param pathToFile path to file
     * @return {@link ArrayList<Station>} list of stations
     */
    public static ArrayList<Station> processStationsFile(Path pathToFile) {

        // filter unnecessary stations
        List<String> filteredFile = FileHelper.fromPath(pathToFile)
                .takeWhile(line -> !line
                        .trim()
                        .startsWith(Constant.Parser.MARK_STATION_EXPENDABLE))
                .toStream()
                .collect(Collectors.toList());

        // first - longitude, second - latitude
        ArrayList<Pair<Double,Double>> coordinatesArray = new ArrayList<>();
        Station station = new Station();

        ArrayList<Station> stations = new ArrayList<>();

        for (String line : filteredFile) {
            if (!line.trim().startsWith(Constant.Parser.MARK_STATION_STOP)) {
                Pair<Double, Double> lastCoordinatesSum = Location.getLastCoordinatesSum(coordinatesArray);
                if (station.hasStops() && lastCoordinatesSum.getFirst() != 0 && lastCoordinatesSum.getSecond() != 0 && !coordinatesArray.isEmpty()) {
                    station.setLocation(Location.getAvgCoordinates(lastCoordinatesSum.getFirst(), lastCoordinatesSum.getSecond(), coordinatesArray.size()));
                    stations.add(station);
                }

                coordinatesArray = new ArrayList<>();
                station = processStationLine(line.trim());

            } else {
                Stop stop = processStopLine(line.trim(), station.getId());
                if (stop.getLatitude() != 0 && stop.getLongitude() != 0) {
                    coordinatesArray.add(new Pair<>(stop.getLongitude(), stop.getLatitude()));
                }
                station.addStop(stop);
            }
        }

        // Add last stops to station
        Pair<Double, Double> lastCoordinatesSum = Location.getLastCoordinatesSum(coordinatesArray);
        if (station.hasStops() && lastCoordinatesSum.getFirst() != 0 && lastCoordinatesSum.getSecond() != 0 && !coordinatesArray.isEmpty()) {
            station.setLocation(Location.getAvgCoordinates(lastCoordinatesSum.getFirst(), lastCoordinatesSum.getSecond(), coordinatesArray.size()));
            stations.add(station);
        }

        return stations;
    }

    /**
     * Process string line containing station information in following format:
     *
     * <code>01001 101 'Achtelky' 'Achtelky' 'Achtelky' 'Achtelky' 'Achtelky'</code>
     *
     * @param line string line containing station information
     * @return {@link Station} instance
     */
    private static Station processStationLine(String line) throws IllegalArgumentException {
        Station station = new Station();

        try {
            String[] values = line.split("\\s+");

            // Set Id
            station.setId(Integer.parseInt(values[0]));

            // Set Zone
            station.setZone(Integer.parseInt(values[1]));

            // Set Name
            station.setName(StringUtils.substringBetween(line,"'","'"));
        } catch (Exception e) {
            throw new IllegalArgumentException("Station line: " + line + " has illegal format.");
        }

        return station;
    }

    /**
     * Process string line containing stop information in following format:
     *
     * <code>S01 +099252582 +295112496 M 000 '>Kam.vrch'</code>
     *
     * @param line string line containing stop information
     * @return {@link Stop} instance
     */

    private static Stop processStopLine(String line, int stationId) {
        Stop stop = new Stop();
        try {
            String[] values = line.split("\\s+");

            // Set id
            stop.setId(Integer.parseInt(values[0].substring(1)));

            // Set station id
            stop.setStationId(stationId);

            // Decode and set latitude and longitude
            stop.setLongitude(Location.decodeKordisLocation(values[1]));
            stop.setLatitude(Location.decodeKordisLocation(values[2]));

            // Set description
            stop.setDescription(StringUtils.substringBetween(line,"'","'"));
        } catch (Exception e) {
            throw new IllegalArgumentException("Stop line: " + line + " has illegal format.");
        }

        return stop;
    }
}
