package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.core.model.wrapper.ScheduleRow
import org.springframework.stereotype.Service

@Service
class CostEvaluatorImpl : CostEvaluator {

    /**
     * Calculate cost.
     *
     * @param scheduleRow Row in schedule
     * @return cost
     */
    override fun getCost(scheduleRow: ScheduleRow): Double {
        return scheduleRow.timeToNextStop.toDouble()
    }
}
