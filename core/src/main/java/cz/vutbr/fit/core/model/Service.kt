package cz.vutbr.fit.core.model

data class Service(
        var code: Int = -1,
        var startStationId: Int = -1,
        var destinationStationId: Int = -1,
        var startStopId: Int = -1,
        var destinationStopId: Int = -1,
        var lineId: Int = -1,
        var lineCode: Int = -1,
        var departureTime: Long = -1,
        var timeToNextStop: Long = -1)
