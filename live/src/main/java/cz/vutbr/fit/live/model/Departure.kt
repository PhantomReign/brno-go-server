package cz.vutbr.fit.live.model

data class Departure(
        val platformId: Int,
        val stopId: Short,
        val lineName: String,
        val finalPlatformName: String,
        val isBarrierLess: Boolean,
        val timeMark: String) {
}
