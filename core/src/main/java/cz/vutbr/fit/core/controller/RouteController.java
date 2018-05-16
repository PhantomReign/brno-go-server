package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.graph.AStar;
import cz.vutbr.fit.core.model.Route;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.model.wrapper.RouteInfo;
import cz.vutbr.fit.core.repository.cache.CachedStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;
import java.util.List;

/**
 * Route controller class. Contains methods used for getting route data.
 *
 */

@RestController
@RequestMapping("/brnogo/api")
public class RouteController {

    private final CachedStationRepository stationRepository;
    private final AStar aStar;

    @Autowired
    public RouteController(CachedStationRepository stationRepository, AStar aStar) {
        this.stationRepository = stationRepository;
        this.aStar = aStar;
    }

    @RequestMapping("/routes")
    public List<Route> getCorrespondingRoutes(@RequestParam("sId") int startStationId,
                                              @RequestParam("dId") int destinationStationId,
                                              @RequestParam("dTime") long dateTime,
                                              @RequestParam("mTime") int minTimeToMove,
                                              @RequestParam("mTrans") int maxTransfers,
                                              @RequestParam("live") boolean liveDataEnabled,
                                              @RequestParam("lim") int routeLimit) {

        RouteInfo info = parseInformation(startStationId, destinationStationId, dateTime, minTimeToMove, maxTransfers, routeLimit, liveDataEnabled);
        return aStar.findMultipleRoutes(info.getStartStation(), info.getDestinationStation(), info);
    }

    @RequestMapping("/directions")
    public Route getDirectionRoutes(@RequestParam("sId") int startStationId,
                                              @RequestParam("dId") int destinationStationId,
                                              @RequestParam("dTime") long dateTime,
                                              @RequestParam("mTime") int minTimeToMove,
                                              @RequestParam("mTrans") int maxTransfers) {

        RouteInfo info = parseInformation(startStationId, destinationStationId, dateTime, minTimeToMove, maxTransfers, 1, false);
        return aStar.findSingleRoute(info.getStartStation(), info.getDestinationStation(), info, info.getDateTime());
    }

    private RouteInfo parseInformation(int startStationId, int destinationStationId, long dateTime, int minTimeToMove,
                                       int maxTransfers, int routeLimit, boolean liveDataEnabled) {
        RouteInfo parsedInfo = new RouteInfo();
        try {
            Station start = stationRepository.findById(startStationId);
            Station end = stationRepository.findById(destinationStationId);

            parsedInfo.setStartStation(start);
            parsedInfo.setDestinationStation(end);
            parsedInfo.setDateTime(dateTime + 20);
            parsedInfo.setMinTimeToMove(minTimeToMove * 60);
            parsedInfo.setMaxTransfers(maxTransfers);
            parsedInfo.setRouteLimit(routeLimit);
            parsedInfo.setLiveDataEnabled(liveDataEnabled);

        } catch (NumberFormatException ex) {
            throw new InvalidParameterException();
        }

        return parsedInfo;
    }

}
