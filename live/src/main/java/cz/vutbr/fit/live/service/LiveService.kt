package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.model.Departure
import cz.vutbr.fit.live.model.Vehicle

interface LiveService {

    fun getVehicles(codes: List<Vehicle>): List<Vehicle>

    fun getDepartures(platformId: Int): List<Departure>
}