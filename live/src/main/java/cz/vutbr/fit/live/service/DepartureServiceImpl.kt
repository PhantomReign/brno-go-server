package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.helper.KordisHelper
import cz.vutbr.fit.live.model.Departure
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
@CacheConfig(cacheNames = ["departures"])
open class DepartureServiceImpl : DepartureService {

    /**
     * Get Live Departure data.
     *
     * @param stationId id of station
     * @return list of departure objects
     */
    @Cacheable(unless = "#result == null")
    override fun getDepartures(stationId: Int): List<Departure> {

        val departures = ArrayList<Departure>()

        val service = KordisHelper.getService()
        val acrossPosts = service.basicHttpBindingINearDeparturesService.getNearDeparturesAcrossPosts(stationId)
        acrossPosts.departuresL.value.nearDeparturesWithPostsRespEntry.mapTo(departures) {
            Departure(stationId, it.postID, it.lineName.value, it.finalStation.value, it.isIsBarrierLess, getNumberTimeMark(it.timeMark.value))
        }

        return departures
    }

    /**
     * Get formatted time mark.
     *
     * @param timeMark time mark
     * @return formatted time mark
     */
    private fun getNumberTimeMark(timeMark: String): String {
        val number = timeMark.replace("[\\D]".toRegex(), "")
        return if (number.isNotBlank()) {
            number
        } else {
            "0"
        }
    }

}