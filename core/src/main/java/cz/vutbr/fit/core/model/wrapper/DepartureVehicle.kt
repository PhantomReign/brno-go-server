package cz.vutbr.fit.core.model.wrapper

data class DepartureVehicle(
        var lineName: String,
        var finalStationName: String,
        var isBarrierLess: Boolean,
        var timeMark: String)
