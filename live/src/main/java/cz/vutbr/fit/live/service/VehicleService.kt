package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.model.Vehicle

interface VehicleService {

    /**
     * Get Live Vehicle data.
     *
     * @return list of vehicle objects
     */
    fun getVehicles(): List<Vehicle>
}