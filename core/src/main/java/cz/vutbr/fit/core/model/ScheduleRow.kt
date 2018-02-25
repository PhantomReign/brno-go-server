package cz.vutbr.fit.core.model

data class ScheduleRow(
        var stationId: Int = -1,
        var stopId: Int = -1,
        var lineId: Int = -1,
        var lineCode: Int = -1,
        var departureTime: Long = -1,
        var timeToNextStop: Long = -1)
