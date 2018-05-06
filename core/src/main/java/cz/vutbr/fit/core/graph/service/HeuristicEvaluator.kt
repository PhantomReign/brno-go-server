package cz.vutbr.fit.core.graph.service

import cz.vutbr.fit.core.model.wrapper.Node

interface HeuristicEvaluator {
    /**
     * Calculate estimation of cost between 2 stations.
     *
     * @param startStation start station object.
     * @param endStation end station station object.
     * @return estimation of cost between two nodes.
     */
    fun getEstimation(startStation: Node, endStation: Node): Double
}
