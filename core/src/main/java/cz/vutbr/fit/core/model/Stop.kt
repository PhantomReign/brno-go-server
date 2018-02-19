package cz.vutbr.fit.core.model

import org.springframework.data.annotation.Id

data class Stop(
        @Id
        var id: Int = 0,
        var stationId: Int = 0,
        var longitude: Double = 0.0,
        var latitude: Double = 0.0,
        var description: String = "") {
}
