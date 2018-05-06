package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.live.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DelayEvaluatorImpl @Autowired
constructor(private val vehicleService: VehicleService) : DelayEvaluator {

    /**
     * Get current delay of first vehicle on specified line.
     *
     * @param lineCode code of line
     * @param lineId id of line
     * @return current delay of first vehicle on specified line.
     */
    override fun getLineDelay(lineCode: Int, lineId: Int): Int {
        val vehicles = vehicleService.getVehicles()
        val filteredVehicles = vehicles.filter { vehicle -> lineCode == vehicle.routeId && vehicle.lineId == lineId }

        return if (filteredVehicles.isEmpty()) 0 else filteredVehicles[0].delay * 60
    }
}
