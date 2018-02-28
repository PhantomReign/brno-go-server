package cz.vutbr.fit.core.model

data class ScheduleRow(
        var destinationStationId: Int = -1,
        var destinationStopId: Int = -1,
        var lineId: Int = -1,
        var lineCode: Int = -1,
        var departureTime: Long = -1,
        var timeToNextStop: Long = -1)
