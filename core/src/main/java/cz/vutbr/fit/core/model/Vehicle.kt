package cz.vutbr.fit.core.model

import java.util.*


data class Vehicle(
        var id: Int,
        var lineId: Int,
        var type: String,
        var delay: Int,
        var vehicles: ArrayList<Objects> = ArrayList()) {
}
