package cz.vutbr.fit.core.model.wrapper

import com.fasterxml.jackson.annotation.JsonIgnore
import cz.vutbr.fit.core.model.Station
import cz.vutbr.fit.core.tools.Constant

data class Node(

        @JsonIgnore
        var station: Station? = null,

        var stationId: Int = -1,
        var stationName: String = "",
        var stationZone: Int = -1,
        var stopId: Int = -1,
        var stopLongitude: Double = 0.0,
        var stopLatitude: Double = 0.0,
        var stopDescription: String = "",

        @JsonIgnore
        var lineId: Int = -1,
        @JsonIgnore
        var lineCode: Int = -1,
        @JsonIgnore
        var lineDelay: Int = 0,

        var timeOfArrival: Long = -1,
        var timeOfDeparture: Long = -1,
        var formattedTimeOfArrival: String = "",
        var formattedTimeOfDeparture: String = "",

        @JsonIgnore
        var parent: Node? = null,
        @JsonIgnore
        var cost: Int = 0,
        @JsonIgnore
        var scheduleRow: ScheduleRow? = null,
        @JsonIgnore
        var rating: Int = 0,
        @JsonIgnore
        var transferCount: Int = 0) {

    constructor(parent: Node?, stationId: Int, stopId: Int, timeOfArrival: Long, cost: Int, rating: Int) : this() {
        this.parent = parent
        this.stationId = stationId
        this.stopId = stopId
        this.timeOfArrival = timeOfArrival
        this.cost = cost
        this.rating = rating
    }

    constructor(stationId: Int, stopId: Int, lineId: Int, lineCode: Int, timeOfArrival: Long, cost: Int, parent: Node?) : this() {

        this.lineCode = lineCode
        this.lineId = lineId
        this.stationId = stationId
        this.stopId = stopId
        this.timeOfArrival = timeOfArrival
        this.cost = cost
        this.parent = parent
    }

    @JsonIgnore
    fun getAvgVehicleSpeed(): Double {
        return when {
            this.lineId < 0 -> Constant.Estimation.AVG_SPEED_WALK
            this.lineId in 0..12 -> Constant.Estimation.AVG_SPEED_TRAM
            this.lineId in 13..39 -> Constant.Estimation.AVG_SPEED_TROLLEYBUS
            else -> return Constant.Estimation.AVG_SPEED_BUS
        }
    }

    @JsonIgnore
    fun getVehicleType(): Int {
        return when {
            this.lineId in 0..12 -> Constant.VehicleType.TRAM
            this.lineId in 13..39 -> Constant.VehicleType.TROLLEY
            else -> return Constant.VehicleType.BUS
        }
    }

}
