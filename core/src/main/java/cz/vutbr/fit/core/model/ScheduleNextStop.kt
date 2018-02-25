package cz.vutbr.fit.core.model

data class ScheduleNextStop(
        var stationId: Int = -1,
        var stopId: Int = -1,
        var lineId: Int = -1)