package cz.vutbr.fit.live.model

data class Vehicle(
        val id: Int,
        val lineId: Int,
        val lastPlatformId: Int,
        val isBarrierLess: Boolean,
        val latitude: Float,
        val longitude: Float,
        val delay: Int) {
}
