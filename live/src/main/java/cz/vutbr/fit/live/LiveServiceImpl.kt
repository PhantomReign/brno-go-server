package cz.vutbr.fit.live

import cz.vutbr.fit.live.model.Departure
import cz.vutbr.fit.live.model.Vehicle
import cz.vutbr.fit.live.service.DepartureService
import cz.vutbr.fit.live.service.LiveService

class LiveServiceImpl : LiveService {

    override fun getVehicles(codes: List<Vehicle>): List<Vehicle> {
        return codes
    }

    override fun getDepartures(platformId: Int): List<Departure> {
        return DepartureService().getDepartures(platformId)
    }

}