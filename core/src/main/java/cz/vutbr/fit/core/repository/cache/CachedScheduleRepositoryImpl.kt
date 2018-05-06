package cz.vutbr.fit.core.repository.cache

import cz.vutbr.fit.core.model.Schedule
import cz.vutbr.fit.core.model.wrapper.ScheduleRow
import cz.vutbr.fit.core.repository.ScheduleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.Comparator

@Service
@CacheConfig(cacheNames = ["schedules"])
open class CachedScheduleRepositoryImpl @Autowired
constructor(private val scheduleRepository: ScheduleRepository) : CachedScheduleRepository {

    @Cacheable(unless = "#result == null")
    override fun findByStationIdAndStopId(stationId: Int, stopId: Int): Schedule? {

        val schedule = scheduleRepository.findByStartStationIdAndStartStopId(stationId, stopId).block()
        schedule?.rows?.sortWith(Comparator.comparingLong<ScheduleRow>({ it.departureTime }))

        return schedule
    }
}
