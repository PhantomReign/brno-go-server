package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.live.model.Vehicle;
import cz.vutbr.fit.live.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/brnogo/api")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    /**
     * Get Vehicle by line code.
     *
     * @param lineCode id code of line.
     * @return {@link Vehicle} closest vehicle
     */
    @RequestMapping("/vehicle")
    public Vehicle getVehicle(@RequestParam("lC") int lineCode, @RequestParam("lId") int lineId) {
        List<Vehicle> vehicles = vehicleService.getVehicles();

        List<Vehicle> filtered = new ArrayList<>();
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getRouteId() == lineCode && vehicle.getLineId() == lineId) {
                filtered.add(vehicle);
            }
        }

        if (filtered.isEmpty()) {
            return new Vehicle(-1, -1, -1, -1, false, (float) 0.0, (float) 0.0, (short) 0);
        }

        return filtered.get(0);
    }

}
