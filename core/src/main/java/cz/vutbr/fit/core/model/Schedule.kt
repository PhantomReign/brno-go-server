package cz.vutbr.fit.core.model

import cz.vutbr.fit.core.model.wrapper.ScheduleNextStop
import cz.vutbr.fit.core.model.wrapper.ScheduleRow
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Schedule(
        var startStationId: Int = -1,
        var startStopId: Int = -1,
        var rows: ArrayList<ScheduleRow> = ArrayList(),
        var nextStops: ArrayList<ScheduleNextStop> = ArrayList()) {

    fun hasRows(): Boolean {
        return !rows.isEmpty()
    }

    fun addRow(row: ScheduleRow) {
        rows.add(row)
    }

    fun hasNextStops(): Boolean {
        return !nextStops.isEmpty()
    }

    fun addDifferentNextStop(stop: ScheduleNextStop) {
        if (!nextStops.contains(stop)) {
            nextStops.add(stop)
        }
    }
}