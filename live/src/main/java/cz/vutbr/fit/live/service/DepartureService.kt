package cz.vutbr.fit.live.service

import cz.vutbr.fit.live.helper.KordisHelper
import cz.vutbr.fit.live.model.Departure

class DepartureService {

    fun getDepartures(vararg params: Any): List<Departure> {

        val departures = ArrayList<Departure>()
        val platformId = params[0] as Int

        val service = KordisHelper.getService()
        val nearDeparturesService = service.basicHttpBindingINearDeparturesService
        val acrossPosts = nearDeparturesService.getNearDeparturesAcrossPosts(platformId)

        acrossPosts.departuresL.value.nearDeparturesWithPostsRespEntry.mapTo(departures) {
            Departure(platformId, it.postID, it.lineName.value, it.finalStation.value, it.isIsBarrierLess, it.timeMark.value)
        }

        return departures
    }

}