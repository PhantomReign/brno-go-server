package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.core.model.wrapper.Node
import cz.vutbr.fit.core.tools.Location
import org.springframework.stereotype.Service

@Service
class HeuristicEvaluatorImpl : HeuristicEvaluator {
    /**
     * Calculate estimation of cost between 2 stations.
     *
     * @param startStation start station object.
     * @param endStation end station station object.
     * @return estimation of cost between two nodes.
     */
    override fun getEstimation(startStation: Node, endStation: Node): Double {
        val distanceInKm = Location.getDistance(startStation.station!!.location, endStation.station!!.location) / 1000
        return distanceInKm / startStation.getAvgVehicleSpeed() * 3600
    }
}
