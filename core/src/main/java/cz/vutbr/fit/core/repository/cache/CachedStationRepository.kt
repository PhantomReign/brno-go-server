package cz.vutbr.fit.core.repository.cache

import cz.vutbr.fit.core.model.Station
import org.springframework.data.geo.Distance
import org.springframework.data.mongodb.core.geo.GeoJsonPoint

interface CachedStationRepository {

    fun findById(stationId: Int): Station?

    fun findByLocationNear(location: GeoJsonPoint, distanceMax: Distance): Station?
}