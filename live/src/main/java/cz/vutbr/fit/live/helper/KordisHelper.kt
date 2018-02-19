package cz.vutbr.fit.live.helper

import cz.vutbr.fit.live.kordis.KORDISService
import java.util.concurrent.ExecutionException

internal object KordisHelper {

    private var kordisService: KORDISService? = null

    @Synchronized
    @Throws(ExecutionException::class)
    fun getService(): KORDISService {
        if (kordisService == null) {
            try {
                kordisService = KORDISService()
            } catch (e: Exception) {
                throw ExecutionException(e.message, e.cause)
            }

        }
        return kordisService as KORDISService
    }
}
