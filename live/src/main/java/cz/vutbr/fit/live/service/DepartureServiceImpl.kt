package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.helper.KordisHelper
import cz.vutbr.fit.live.model.Departure
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
@CacheConfig(cacheNames = ["departures"])
open class DepartureServiceImpl : DepartureService {

    @Cacheable(unless = "#result == null")
    override fun getDepartures(stationId: Int): List<Departure> {
        println("MISS")

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
        }


        val departures = ArrayList<Departure>()

        val service = KordisHelper.getService()
        val acrossPosts = service.basicHttpBindingINearDeparturesService.getNearDeparturesAcrossPosts(stationId)

        acrossPosts.departuresL.value.nearDeparturesWithPostsRespEntry.mapTo(departures) {
            Departure(stationId, it.postID, it.lineName.value, it.finalStation.value, it.isIsBarrierLess, it.timeMark.value)
        }

        return departures
    }

}