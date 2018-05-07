package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.live.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
@CacheConfig(cacheNames = ["delays"])
open class DelayEvaluatorImpl @Autowired
constructor(private val vehicleService: VehicleService) : DelayEvaluator {

    /**
     * Get current delay of first vehicle on specified line.
     *
     * @param lineCode code of line
     * @param lineId id of line
     * @return current delay of first vehicle on specified line.
     */
    @Cacheable(unless = "#result == null")
    override fun getLineDelay(lineCode: Int, lineId: Int): Int {
        val vehicles = vehicleService.getVehicles()
        val foundVehicle = vehicles.firstOrNull { vehicle ->  lineCode == vehicle.routeId && vehicle.lineId == lineId}
        return if (foundVehicle == null) 0 else foundVehicle.delay * 60
    }
}
