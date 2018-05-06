package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.core.model.wrapper.ScheduleRow

interface CostEvaluator {

    /**
     * Evaluator of cost between two stations
     *
     * @param scheduleRow row containing cost information to next station.
     * @return calculated cost value.
     */
    fun getCost(scheduleRow: ScheduleRow): Double
}
