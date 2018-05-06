package cz.vutbr.fit.live.model

data class Vehicle(
        val routeId: Int,
        val carNum: Int,
        val lineId: Int,
        val lastPlatformId: Int,
        val isBarrierLess: Boolean,
        val longitude: Float,
        val latitude: Float,
        val delay: Short) {
}
