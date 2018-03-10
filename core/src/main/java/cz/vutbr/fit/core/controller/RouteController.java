package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.model.Route;
import cz.vutbr.fit.live.model.Departure;
import cz.vutbr.fit.live.service.DepartureService;
import cz.vutbr.fit.live.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/brnogo/api")
public class RouteController {

    final DepartureService departureService;
    final VehicleService vehicleService;

    @Autowired
    public RouteController(DepartureService departureService, VehicleService vehicleService) {
        this.departureService = departureService;
        this.vehicleService = vehicleService;
    }

    /*

    @RequestParam("sId") String startStationId,
                                                    @RequestParam("dId") String destinationStationId,
                                                    @RequestParam("uLat") String userLatitude,
                                                    @RequestParam("uLon") String userLongitude,
                                                    @RequestParam("dTime") String dateTime,
                                                    @RequestParam("mTime") String minTimeToMove,
                                                    @RequestParam("mTrans") String maxTransfers

     */

    @RequestMapping("/routes")
    public ArrayList<Route> getCorrespondingRoutes() {

        ArrayList<Route> routes = new ArrayList<>();

        List<Departure> departureList = departureService.getDepartures(1567);

        for (Departure departure: departureList) {
            System.out.println(departure.getLineName() + " "
                    + departure.getPlatformId() + "/" + departure.getStopId()
                    + " ----> " + departure.getFinalPlatformName());

        }



        return routes;
    }
}
