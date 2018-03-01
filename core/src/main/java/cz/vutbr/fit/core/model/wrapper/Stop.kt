package cz.vutbr.fit.core.model.wrapper

import org.springframework.data.annotation.Id

data class Stop(
        @Id
        var id: Int = -1,
        var stationId: Int = -1,
        var longitude: Double = 0.0,
        var latitude: Double = 0.0,
        var description: String = "") {
}
