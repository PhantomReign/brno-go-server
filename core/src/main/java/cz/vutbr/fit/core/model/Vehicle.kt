package cz.vutbr.fit.core.model

import cz.vutbr.fit.core.model.wrapper.Node
import java.util.*


data class Vehicle(
        var lineCode: Int = -1,
        var lineId: Int = -1,
        var type: Int = -1,
        var delay: Int = 0,
        var path: List<Node> = ArrayList()) {
}
