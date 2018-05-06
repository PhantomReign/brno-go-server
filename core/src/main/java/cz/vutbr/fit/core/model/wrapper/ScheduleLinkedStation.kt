package cz.vutbr.fit.core.model.wrapper

data class ScheduleLinkedStation(
        var stationId: Int = -1,
        var stopId: Int = -1,
        var lineId: Int = -1,
        var lineCode: Int = -1)