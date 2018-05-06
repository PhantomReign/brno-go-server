package cz.vutbr.fit.core.model

import com.fasterxml.jackson.annotation.JsonIgnore
import cz.vutbr.fit.core.model.wrapper.Stop
import org.springframework.data.annotation.Id
import org.springframework.data.geo.Point
import org.springframework.data.mongodb.core.geo.GeoJsonPoint
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed
import org.springframework.data.mongodb.core.mapping.Document
import java.util.ArrayList

@Document
data class Station(
        @Id
        var id: Int = -1,
        var name: String = "",
        var zone: Int = -1,
        @JsonIgnore
        @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
        var location: GeoJsonPoint? = GeoJsonPoint(0.0,0.0),
        @JsonIgnore
        var stops: ArrayList<Stop> = ArrayList()) {

    fun hasStops(): Boolean {
        return !stops.isEmpty()
    }

    fun addStop(stop: Stop) {
        stops.add(stop)
    }

    fun getStopFromStation(stopId: Int): Stop? {
        return if (hasStops()) {
            stops.firstOrNull { it.id == stopId }
        } else {
            null
        }
    }
}
