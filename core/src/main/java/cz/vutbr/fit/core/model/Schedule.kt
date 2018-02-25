package cz.vutbr.fit.core.model

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Schedule(
        var stationId: Int = -1,
        var stopId: Int = -1,
        var row: ArrayList<ScheduleRow> = ArrayList(),
        var nextStop: ArrayList<ScheduleNextStop> = ArrayList())