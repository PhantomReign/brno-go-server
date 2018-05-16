package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.helper.KordisHelper
import cz.vutbr.fit.live.model.Vehicle
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
@CacheConfig(cacheNames = ["vehicles"])
open class VehicleServiceImpl : VehicleService {

    /**
     * Get Live Vehicle data.
     *
     * @return list of vehicle objects
     */
    @Cacheable(unless = "#result == null")
    override fun getVehicles(): List<Vehicle> {

        val vehicles = ArrayList<Vehicle>()

        val service = KordisHelper.getService()
        val trafficState = service.basicHttpBindingITrafficState.trafficState

        trafficState.vehicleL.value.trafficStateRespEntry.mapTo(vehicles) {
            Vehicle(it.routeID, it.carNum, it.lineID.toInt(), it.lastStopID, it.isIsBarrierLess, it.longitude, it.latitude, it.delayInMins)
        }

        return vehicles
    }

}
