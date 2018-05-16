package cz.vutbr.fit.live.model

data class Departure(
        val platformId: Int,
        val stopId: Short,
        val lineName: String,
        val finalPlatformName: String,
        val isBarrierLess: Boolean,
        val timeMark: String) {

    fun getFormattedTimeMark(): String {
        val numberOfDigits = timeMark.length
        return if (numberOfDigits > 2) {
            timeMark.substring(0, 2) + ":" + timeMark.substring(2, 4)
        } else {
            "$timeMark min"
        }
    }
}
