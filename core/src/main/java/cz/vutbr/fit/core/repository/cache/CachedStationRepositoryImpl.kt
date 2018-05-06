package cz.vutbr.fit.core.repository.cache

import cz.vutbr.fit.core.model.Station
import cz.vutbr.fit.core.repository.StationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.data.geo.Distance
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
@CacheConfig(cacheNames = ["stations"])
open class CachedStationRepositoryImpl @Autowired
constructor(private val stationRepository: StationRepository) : CachedStationRepository {

    @Cacheable(unless = "#result == null")
    override fun findById(stationId: Int): Station? {
        return stationRepository.findById(stationId).block()
    }

    @Cacheable(unless = "#result == null")
    override fun findByLocationNear(location: GeoJsonPoint, distanceMax: Distance): Station? {
        val stations = stationRepository.findByLocationNear(location, distanceMax).toStream().collect(Collectors.toList())
        return if (!stations.isEmpty()) stations[0] else null
    }
}
