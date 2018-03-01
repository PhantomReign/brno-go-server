package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.model.Departure

interface DepartureService {

    fun getDepartures(stationId: Int): List<Departure>
}