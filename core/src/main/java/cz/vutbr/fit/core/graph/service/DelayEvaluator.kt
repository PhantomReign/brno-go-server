package cz.vutbr.fit.core.graph.service

interface DelayEvaluator {

    /**
     * Get current delay of first vehicle on specified line.
     *
     * @param lineCode code of line
     * @param lineId id of line
     * @return current delay of first vehicle on specified line.
     */
    fun getLineDelay(lineCode: Int, lineId: Int): Int

}
