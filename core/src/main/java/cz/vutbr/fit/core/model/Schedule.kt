package cz.vutbr.fit.core.model

import cz.vutbr.fit.core.model.wrapper.ScheduleLinkedStation
import cz.vutbr.fit.core.model.wrapper.ScheduleRow
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Schedule(
        var startStationId: Int = -1,
        var startStopId: Int = -1,
        var rows: ArrayList<ScheduleRow> = ArrayList(),
        var linkedStations: ArrayList<ScheduleLinkedStation> = ArrayList()) {

    fun hasRows(): Boolean {
        return !rows.isEmpty()
    }

    fun addRow(row: ScheduleRow) {
        rows.add(row)
    }

    fun hasLinkedStations(): Boolean {
        return !linkedStations.isEmpty()
    }

    fun addDifferentNextStop(stop: ScheduleLinkedStation) {
        if (!linkedStations.contains(stop)) {
            linkedStations.add(stop)
        }
    }
}