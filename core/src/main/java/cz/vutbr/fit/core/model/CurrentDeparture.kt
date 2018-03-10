package cz.vutbr.fit.core.model

import cz.vutbr.fit.core.model.wrapper.DepartureVehicle

data class CurrentDeparture(
        var stationId: Int,
        var direction: String,
        var vehicles: ArrayList<DepartureVehicle>)
