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

    final DepartureService departureServiceIf;
    final VehicleService vehicleService;

    @Autowired
    public RouteController(DepartureService departureServiceIf, VehicleService vehicleService) {
        this.departureServiceIf = departureServiceIf;
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

        List<Departure> departureList = departureServiceIf.getDepartures(1104);
        System.out.println(departureList.toString());

        System.out.println("AGAIN");

        List<Departure> departureList2 = departureServiceIf.getDepartures(1104);
        System.out.println(departureList2.toString());

        System.out.println(departureList2.equals(departureList));


        return routes;
    }
}
