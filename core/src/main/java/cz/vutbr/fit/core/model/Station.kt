package cz.vutbr.fit.core.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import org.springframework.data.mongodb.core.mapping.Document
import java.util.ArrayList

@Document
data class Station(
        @Id
        var id: Int = -1,
        var name: String = "",
        var zone: Int = -1,
        @JsonIgnore
        var location: GeoJsonPoint? = GeoJsonPoint(0.0,0.0),
        @JsonIgnore
        var stops: ArrayList<Stop> = ArrayList()) {

    fun hasStops(): Boolean {
        return !stops.isEmpty()
    }

    fun addStop(stop: Stop) {
        stops.add(stop)
    }
}
