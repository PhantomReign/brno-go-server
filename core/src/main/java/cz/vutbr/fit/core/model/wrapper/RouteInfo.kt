package cz.vutbr.fit.core.model.wrapper

import cz.vutbr.fit.core.model.Station

data class RouteInfo(
        var startStation: Station? = null,
        var destinationStation: Station? = null,

        var liveDataEnabled: Boolean = false,
        var dateTime: Long = -1,
        var minTimeToMove: Int = -1,
        var maxTransfers: Int = -1,
        var routeLimit: Int = -1) {
}
