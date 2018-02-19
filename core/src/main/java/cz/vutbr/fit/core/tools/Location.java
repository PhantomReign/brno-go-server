package cz.vutbr.fit.core.tools;

import kotlin.Pair;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.ArrayList;

public class Location {

    /**
     * Converts Kordis coordinates to proper GPS coordinates.
     * Method can be used for both coordinates, because of the same encoding formula.
     *
     * Provided decoding formula:
     * P = value / 100000
     * deg = P / 60                                                 [rounded down]
     * min = ((P / 60) - deg) * 60                                  [rounded down]
     * sec = ((((P / 60) - deg) * 60) - min) * 60                   [rounded down]
     * mil = ((((((P / 60) - deg) * 60) - min) * 60) - sec) * 60    [rounded down]
     *
     * For decimal degrees are needed just first two steps without rounding.
     *
     * @param location location in Kordis format.
     * @return location in proper format (ex. 16.1234567).
     */
    public static double decodeKordisLocation(String location) {
        return Double.parseDouble(location) / 100000 / 60;
    }


    /**
     * Get average coordinates
     *
     * @param latitude latitude
     * @param longitude longitude
     * @param coordinatesCount number of coordinates
     * @return location in GeoJsonPoint format.
     */
    public static GeoJsonPoint getAvgCoordinates(double longitude, double latitude, int coordinatesCount) {
        double avgLatitude = latitude / coordinatesCount;
        double avgLongitude = longitude / coordinatesCount;
        return new GeoJsonPoint(avgLongitude, avgLatitude);
    }

    /**
     * Get sum of coordinates
     *
     * @param coordinates list of coordinates
     * @return sum of coordinates in Pair.
     */
    public static Pair<Double, Double> getLastCoordinatesSum(ArrayList<Pair<Double, Double>> coordinates) {
        double sumLongitude = 0;
        double sumLatitude = 0;

        for (Pair<Double, Double> coordinate: coordinates) {
            sumLongitude += coordinate.getFirst();
            sumLatitude += coordinate.getSecond();
        }

        return new Pair<>(sumLongitude, sumLatitude);
    }
}
