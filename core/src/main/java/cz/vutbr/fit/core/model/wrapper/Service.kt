package cz.vutbr.fit.core.model.wrapper

data class Service(
        var code: Int = -1,
        var startStationId: Int = -1,
        var destinationStationId: Int = -1,
        var startStopId: Int = -1,
        var destinationStopId: Int = -1,
        var lineId: Int = -1,
        var lineCode: Int = -1,
        var departureTime: Long = -1,
        var timeToNextStop: Long = -1) {

    constructor(service: Service) : this() {
        this.code = service.code
        this.startStationId = service.startStationId
        this.destinationStationId = service.destinationStationId
        this.startStopId = service.startStopId
        this.destinationStopId = service.destinationStopId
        this.lineId = service.lineId
        this.lineCode = service.lineCode
        this.departureTime = service.departureTime
        this.timeToNextStop = service.timeToNextStop
    }
}