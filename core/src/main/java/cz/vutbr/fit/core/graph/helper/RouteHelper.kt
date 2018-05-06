package cz.vutbr.fit.core.graph.helper

import cz.vutbr.fit.core.model.Route
import cz.vutbr.fit.core.model.Vehicle
import cz.vutbr.fit.core.model.wrapper.Node
import cz.vutbr.fit.core.model.wrapper.Stop
import cz.vutbr.fit.core.tools.DateTime
import java.util.*

internal object RouteHelper {

    /**
     * Create route from last node.
     *
     * @param lastNode last node in path
     * @param timeToMove time required to move
     * @return route
     */
    fun createRoute(lastNode: Node, timeToMove: Int): Route {
        val route = Route()
        val linkedNodes = linkNodes(lastNode)

        if (!linkedNodes.isEmpty()) {
            val vehiclesList = ArrayList<Vehicle>()

            var lastUnchangedVehicleNode = linkedNodes.first
            var path: MutableList<Node> = ArrayList()

            var previousNode: Node? = null
            for (linkedNode in linkedNodes) {
                if (previousNode != null && linkedNode.lineId != previousNode.lineId) {
                    var delay: Int? = 0
                    if (!path.isEmpty()) {
                        delay = path[path.size - 1].lineDelay
                    }

                    val vehicle = Vehicle(lastUnchangedVehicleNode.lineCode, lastUnchangedVehicleNode.lineId, lastUnchangedVehicleNode.getVehicleType(), delay!!, path)

                    vehiclesList.add(vehicle)
                    path = ArrayList()
                    lastUnchangedVehicleNode = previousNode
                }

                previousNode = linkedNode
                path.add(linkedNode)

            }

            var delay = 0
            if (!path.isEmpty()) {
                delay = path[path.size - 1].lineDelay
            }

            val vehicle = Vehicle(lastNode.lineCode, lastNode.lineId, lastNode.getVehicleType(), delay, path)
            vehiclesList.add(vehicle)

            val (firstStation, firstStationId, _, _, _, _, _, _, _, _, _, _, startTime) = linkedNodes.first
            val (lastStation, lastStationId, _, _, _, _, _, _, _, _, _, endTime) = linkedNodes.last

            var totalDelay = 0
            for ((_, _, _, vehicleDelay) in vehiclesList) {
                totalDelay += vehicleDelay
            }

            val time = (Math.abs(startTime - endTime) + totalDelay).toInt()

            route.id = Objects.hash(firstStation!!.id, lastStation!!.id, startTime, endTime, time, vehiclesList.size).toString()
            route.startStationName = firstStation.name
            route.startStationId = firstStationId
            route.destinationStationName = lastStation.name
            route.destinationStationId = lastStationId
            route.routeTime = time
            route.vehicles = vehiclesList
            route.minTimeToMove = timeToMove
        }

        return route
    }

    /**
     * Link nodes from last node and correct information.
     *
     * @param lastNode last node in path
     * @return linked list of nodes
     */
    private fun linkNodes(lastNode: Node?): LinkedList<Node> {
        val nodes = LinkedList<Node>()

        if (lastNode != null) {
            var currentNode = lastNode
            var previousNode: Node? = null

            // link nodes starting from destination
            while (true) {
                correctTimeInNodes(currentNode!!, previousNode)
                setStopInformation(currentNode)

                nodes.addFirst(currentNode)

                previousNode = currentNode
                currentNode = currentNode.parent

                if (currentNode == null) {
                    break
                }
            }

        }
        return nodes
    }

    /**
     * Refactor time fields of current node by using values from previous node
     *
     * @param currentNode current node
     * @param previousNode previous node
     */
    private fun correctTimeInNodes(currentNode: Node, previousNode: Node?) {

        if (previousNode != null) {
            currentNode.timeOfDeparture = previousNode.scheduleRow!!.departureTime
            currentNode.lineCode = previousNode.scheduleRow!!.lineCode
            currentNode.lineId = previousNode.scheduleRow!!.lineId

            if (previousNode.stationId == currentNode.stationId) {
                currentNode.timeOfDeparture = -1
                currentNode.formattedTimeOfDeparture = ""
            } else {
                currentNode.formattedTimeOfDeparture = DateTime.epochSecToZonedTimeString(currentNode.timeOfDeparture)
            }

        } else {
            currentNode.timeOfDeparture = -1
            currentNode.formattedTimeOfDeparture = ""
        }

        if (currentNode.parent == null || currentNode.stationId == currentNode.parent!!.stationId) {
            currentNode.timeOfArrival = -1
            currentNode.formattedTimeOfArrival = ""
        } else {
            currentNode.formattedTimeOfArrival = DateTime.epochSecToZonedTimeString(currentNode.timeOfArrival)
        }
    }

    /**
     * Set information about stop.
     *
     * @param currentNode current node
     */
    private fun setStopInformation(currentNode: Node) {
        val stop = currentNode.station!!.getStopFromStation(currentNode.stopId)

        if (stop != null) {
            currentNode.stopId = stop.id
            currentNode.stopLongitude = stop.longitude
            currentNode.stopLatitude = stop.latitude
            currentNode.stopDescription = stop.description
        }
    }
}
