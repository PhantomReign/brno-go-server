package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.model.Departure

interface DepartureService {

    /**
     * Get Live Departure data.
     *
     * @param stationId id of station
     * @return list of departure objects
     */
    fun getDepartures(stationId: Int): List<Departure>
}