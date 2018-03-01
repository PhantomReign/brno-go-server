package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.model.Vehicle

interface VehicleService {

    fun getVehicles(): List<Vehicle>
}