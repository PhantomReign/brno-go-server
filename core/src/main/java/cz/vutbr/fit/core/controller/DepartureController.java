package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.model.CurrentDeparture;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.model.wrapper.DepartureVehicle;
import cz.vutbr.fit.core.model.wrapper.Stop;
import cz.vutbr.fit.core.repository.StationRepository;
import cz.vutbr.fit.core.tools.Constant;
import cz.vutbr.fit.live.model.Departure;
import cz.vutbr.fit.live.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/brnogo/api")
public class DepartureController {

    private final DepartureService departureService;
    private final StationRepository stationRepository;

    @Autowired
    public DepartureController(DepartureService departureService, StationRepository stationRepository) {
        this.departureService = departureService;
        this.stationRepository = stationRepository;
    }

    /**
     * Sort departures by ID of stop and then by time.
     *
     * @param stationId id of station
     * @return {@link ArrayList<CurrentDeparture>} list of current departures from station
     */
    @RequestMapping("/departures")
    public Mono<ArrayList<CurrentDeparture>> getCorrespondingDepartures(@RequestParam("sId") int stationId) {

        return stationRepository.findById(stationId).map(foundStation -> {
            if (foundStation.hasStops()) {
                List<Stop> stops = foundStation.getStops();
                Map<Integer, String> mappedStopsDirection = stops
                        .stream()
                        .collect(Collectors.toMap(Stop::getId, Stop::getDirectionFromDescription));
                List<Departure> departureList = getSortedDepartures(stationId);
                return getCurrentDepartures(stationId, mappedStopsDirection, departureList);
            } else {
                return new ArrayList<>();
            }
        });
    }

    /**
     * Sort departures by ID of stop and then by time.
     *
     * @param stationId id of station
     * @return {@link List<Departure>} sorted list of departures
     */
    private List<Departure> getSortedDepartures(int stationId) {
        List<Departure> departureList = departureService.getDepartures(stationId);
        departureList.sort(Comparator
                .comparing(Departure::getStopId)
                .thenComparing(departure -> {

                    if (departure.getTimeMark().length() > 2) {
                        return Integer.parseInt(departure.getTimeMark()) + Constant.DepartureTime.TIME_CORRECTION;
                    } else {
                        return Integer.parseInt(departure.getTimeMark());
                    }
                }));
        return departureList;
    }

    /**
     * Sort departures by ID of stop and then by time.
     *
     * @param stationId id of station
     * @param mappedStopsDirection map of formatted description accessed by stop ID.
     * @param departureList list of departures from station
     * @return {@link ArrayList<CurrentDeparture>} list of formatted departures
     */
    private ArrayList<CurrentDeparture> getCurrentDepartures(int stationId, Map<Integer, String> mappedStopsDirection, List<Departure> departureList) {
        ArrayList<CurrentDeparture> currentDepartureList = new ArrayList<>();
        ArrayList<DepartureVehicle> departureVehicleList = new ArrayList<>();

        if (departureList.isEmpty()) {
            return currentDepartureList;
        }

        int firstId = departureList.get(0).getStopId();
        String direction = mappedStopsDirection.get(firstId);

        for (Departure departure: departureList) {

            if (firstId == departure.getStopId()) {
                departureVehicleList.add(new DepartureVehicle(departure.getLineName(), departure.getFinalPlatformName(), departure.isBarrierLess(), departure.getFormattedTimeMark()));
            } else {

                currentDepartureList.add(new CurrentDeparture(stationId, direction, departureVehicleList));
                departureVehicleList = new ArrayList<>();
                firstId = departure.getStopId();
                direction = mappedStopsDirection.get((int) departure.getStopId());
                departureVehicleList.add(new DepartureVehicle(departure.getLineName(), departure.getFinalPlatformName(), departure.isBarrierLess(), departure.getFormattedTimeMark()));
            }
        }

        currentDepartureList.add(new CurrentDeparture(stationId, direction, departureVehicleList));

        return currentDepartureList;
    }

}
