package cz.vutbr.fit.core.model

data class Route(
        var id: String = "",
        var startStationId: Int = -1,
        var destinationStationId: Int = -1,
        var startStationName: String = "",
        var destinationStationName: String = "",

        var routeTime: Int = -1,
        var minTimeToMove: Int = -1,
        var vehicles: ArrayList<Vehicle> = ArrayList(),
        var saved: Boolean = false) {
}
