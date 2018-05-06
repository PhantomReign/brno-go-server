package cz.vutbr.fit.core.repository.cache

import cz.vutbr.fit.core.model.Schedule

interface CachedScheduleRepository {
    fun findByStationIdAndStopId(stationId: Int, stopId: Int): Schedule?
}
