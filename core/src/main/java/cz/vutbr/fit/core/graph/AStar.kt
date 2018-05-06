package cz.vutbr.fit.core.graph

import cz.vutbr.fit.core.graph.service.CostEvaluator
import cz.vutbr.fit.core.graph.service.DelayEvaluator
import cz.vutbr.fit.core.graph.service.HeuristicEvaluator
import cz.vutbr.fit.core.graph.helper.RouteHelper
import cz.vutbr.fit.core.model.Route
import cz.vutbr.fit.core.model.Schedule
import cz.vutbr.fit.core.model.Station
import cz.vutbr.fit.core.model.wrapper.*
import cz.vutbr.fit.core.repository.cache.CachedScheduleRepository
import cz.vutbr.fit.core.repository.cache.CachedStationRepository
import cz.vutbr.fit.core.tools.Constant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util.*

@Service
class AStar @Autowired
constructor(private val scheduleRepository: CachedScheduleRepository,
            private val stationRepository: CachedStationRepository,
            private val costEvaluator: CostEvaluator,
            private val heuristicEvaluator: HeuristicEvaluator,
            private val delayEvaluator: DelayEvaluator) {

    /**
     * Get limited multiple routes from start station to destination station.
     *
     * @param start start station
     * @param destination end station
     * @param config route configuration
     * @return limited multiple routes
     */
    fun findMultipleRoutes(start: Station, destination: Station, config: RouteInfo): List<Route> {
        var startTime = config.dateTime
        var previous: Route? = null
        val routeList = ArrayList<Route>()
        for (i in 0 until config.routeLimit) {
            if (previous != null) {
                val delay = previous.vehicles[0].delay
                startTime = previous.vehicles[0].path[0].timeOfDeparture + 1 + delay.toLong()
            }

            val route = findSingleRoute(start, destination, config, startTime)

            if (route != null) {
                previous = route
                routeList.add(route)
            }
        }
        return routeList
    }

    /**
     * Get single route from start station to destination station.
     *
     * @param start start station
     * @param destination end station
     * @param config route configuration
     * @return single route
     */
    fun findSingleRoute(start: Station, destination: Station, config: RouteInfo, startDayTime: Long): Route? {

        val queue = PriorityQueue(Comparator.comparingInt<Node>({ it.rating }))

        // <Hash, Cost>
        val mappedCost = HashMap<Int, Int>()

        val startNode = Node(null, start.id, -1, startDayTime, 0, 0)
        startNode.station = start
        startNode.stationName = start.name
        startNode.stationZone = start.zone

        val endNode = Node(null, destination.id, -1, -1, 0, 0)
        endNode.station = destination
        endNode.stationName = destination.name
        endNode.stationZone = destination.zone

        // start and destination can not be same
        if (start.id == destination.id) {
            return null
        }

        if (start.hasStops()) {
            val (id) = start.stops[0]
            mappedCost[start.id] = 0
            startNode.stopId = id

            queue.offer(startNode)
        }

        while (!queue.isEmpty()) {
            val node = queue.poll()

            // destination has been reached - create right route representation.
            if (node!!.stationId == destination.id) {
                return RouteHelper.createRoute(node, config.minTimeToMove)
            }
            expand(node, queue, mappedCost, config, endNode)
        }

        return null
    }

    /**
     * Expand nodes from queue.
     *
     * @param currentNode start station
     * @param queue queue of next nodes
     * @param mappedCost map of node costs
     * @param config route configuration
     * @param destinationNode destination Node
     */
    private fun expand(currentNode: Node, queue: PriorityQueue<Node>, mappedCost: HashMap<Int, Int>,
                       config: RouteInfo, destinationNode: Node) {

        val station = stationRepository.findById(currentNode.stationId)

        val nodesOfStops = createNodesFromStops(currentNode, station!!)

        for (node in nodesOfStops) {

            val schedule = scheduleRepository.findByStationIdAndStopId(currentNode.stationId, node.stopId) ?: continue

            for (linkedStation in schedule.linkedStations) {
                val scheduleRow: ScheduleRow = (if (config.liveDataEnabled) {
                    getCorrectLiveScheduleRow(schedule, linkedStation, node, if (node.parent != null) config.minTimeToMove else 0)
                } else {
                    getCorrectScheduleRow(schedule, linkedStation, node, if (node.parent != null) config.minTimeToMove else 0)
                }) ?: continue

                if (scheduleRow.departureTime >= config.dateTime + Constant.Time.ONE_DAY_IN_SECONDS) {
                    continue
                }

                val waitTime: Int
                var nextLineDelay: Int? = 0
                val currentLineDelay: Int

                if (config.liveDataEnabled) {
                    nextLineDelay = delayEvaluator.getLineDelay(scheduleRow.lineCode, scheduleRow.lineId)
                    currentLineDelay = delayEvaluator.getLineDelay(node.lineCode, node.lineId)
                    waitTime = (scheduleRow.departureTime + nextLineDelay - (node.timeOfArrival + currentLineDelay)).toInt()
                } else {
                    waitTime = (scheduleRow.departureTime - node.timeOfArrival).toInt()
                }

                var transferPenalty = 0
                var isTransfer = false

                if (node.lineId != scheduleRow.lineId && node.parent != null) {
                    isTransfer = true
                    val parentDelay = delayEvaluator.getLineDelay(node.parent!!.lineCode, node.parent!!.lineId).toLong()
                    val timeForTransfer = (scheduleRow.departureTime + nextLineDelay!! - (node.parent!!.timeOfArrival + parentDelay)).toInt()

                    if (timeForTransfer < config.minTimeToMove) {
                        continue
                    }

                    if (node.transferCount < config.maxTransfers) {
                        transferPenalty = config.minTimeToMove
                    } else {
                        continue
                    }

                }

                val cost = node.cost + waitTime + transferPenalty
                val costToNext = costEvaluator.getCost(scheduleRow).toInt()
                val transferCount = if (isTransfer) node.transferCount + 1 else node.transferCount

                offerNode(queue, mappedCost, linkedStation, scheduleRow, node, destinationNode, cost, costToNext, nextLineDelay!!, transferCount)
            }
        }
    }

    /**
     * Create new nodes for each stop.
     *
     * @param currentNode current node
     * @param station station
     * @return list of nodes
     */
    private fun createNodesFromStops(currentNode: Node, station: Station): List<Node> {
        val result = ArrayList<Node>()
        for ((id) in station.stops) {
            if (id != currentNode.stopId) {

                val node = Node(if (currentNode.parent != null) currentNode else null,
                        station.id,
                        id,
                        currentNode.timeOfArrival,
                        currentNode.cost,
                        currentNode.rating)

                node.scheduleRow = currentNode.scheduleRow
                node.station = currentNode.station
                node.stationName = currentNode.station!!.name
                node.stationZone = currentNode.station!!.zone
                if (currentNode.parent != null) {
                    node.transferCount = currentNode.transferCount
                }
                result.add(node)
            } else {
                result.add(currentNode)
            }
        }
        return result
    }

    /**
     * Offer node to queue.
     *
     * @param queue queue of next nodes
     * @param mappedCost map of node costs
     * @param linkedStation next station connected to current station
     * @param row schedule row
     * @param node map of node costs
     * @param destinationNode destination node
     * @param cost sum of cost of node, wait time and penalty for transfer
     * @param costToNext cost to next station
     * @param nextLineDelay next line delay
     * @param transferCount number of transfers
     */
    private fun offerNode(queue: PriorityQueue<Node>,
                          mappedCost: HashMap<Int, Int>,
                          linkedStation: ScheduleLinkedStation,
                          row: ScheduleRow,
                          node: Node,
                          destinationNode: Node,
                          cost: Int,
                          costToNext: Int,
                          nextLineDelay: Int,
                          transferCount: Int) {

        val nextHash = Objects.hash(linkedStation.stationId, linkedStation.stopId, linkedStation.lineId)

        if (cost < mappedCost.getOrDefault(nextHash, Integer.MAX_VALUE)) {
            val destPlatform = stationRepository.findById(linkedStation.stationId)

            val nextNode = Node(linkedStation.stationId, linkedStation.stopId, row.lineId,
                    row.lineCode,
                    row.departureTime + row.timeToNextStop,
                    cost + costToNext, node)
            nextNode.scheduleRow = row
            nextNode.station = destPlatform
            nextNode.stationName = destPlatform!!.name
            nextNode.stationZone = destPlatform.zone
            val estCost = heuristicEvaluator.getEstimation(nextNode, destinationNode).toInt()
            nextNode.rating = cost + costToNext + estCost
            nextNode.transferCount = transferCount
            nextNode.lineDelay = nextLineDelay
            mappedCost[nextHash] = cost
            queue.offer(nextNode)
        }
    }

    /**
     * Find index of nearest row based on schedule and start time by using binary search.
     *
     * @param schedule schedule
     * @param startTime start time
     * @return index of nearest row
     */
    private fun getIndexOfNearestRow(schedule: Schedule, startTime: Long): Int {
        val fromRow = ScheduleRow()
        fromRow.departureTime = startTime

        var index = Collections.binarySearch(schedule.rows, fromRow)

        if (index < 0) {
            index = index * -1 - 1
        } else {
            var sub = 0
            for (i in index downTo 1) {
                if (schedule.rows[i].departureTime >= startTime) {
                    sub++
                } else {
                    break
                }
            }
            index -= (sub - 1)
        }
        return index
    }

    /**
     * Find nearest row in schedule.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param startTime start time
     * @param currentLineId id of current line
     * @param minTimeToMove min time required to get to stop or for transfer
     * @return nearest schedule row
     */
    private fun findNearestRow(schedule: Schedule, linkedStation: ScheduleLinkedStation, startTime: Long, currentLineId: Int, minTimeToMove: Int): ScheduleRow? {
        val index = getIndexOfNearestRow(schedule, startTime)
        val size = schedule.rows.size
        for (i in index until size) {
            val row = schedule.rows[i]
            if (row.destinationStationId == linkedStation.stationId
                    && row.destinationStopId == linkedStation.stopId
                    && row.lineId == linkedStation.lineId
                    && row.lineCode == linkedStation.lineCode
                    //&& row.departureTime >= (if (currentLineId != row.lineId) startTime + minTimeToMove else startTime)
                    && row.departureTime >= startTime) {
                return row
            }
        }
        return null
    }

    /**
     * Find previous nearest row in schedule.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param startTime start time
     * @return previous nearest schedule row or null
     */
    private fun findPreviousNearestRow(schedule: Schedule, linkedStation: ScheduleLinkedStation, startTime: Long): ScheduleRow? {
        val index = getIndexOfNearestRow(schedule, startTime) - 1
        if (index > 0) {
            for (i in index downTo 0) {
                val scheduleRow = schedule.rows[i]
                if (scheduleRow.destinationStationId == linkedStation.stationId
                        && scheduleRow.destinationStopId == linkedStation.stopId
                        && scheduleRow.lineId == linkedStation.lineId
                        && scheduleRow.lineCode == linkedStation.lineCode
                        && scheduleRow.departureTime < startTime) {
                    return scheduleRow
                }
            }
        }

        return null
    }

    /**
     * Get previous nearest row in schedule if is row available.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param currentNode current node
     * @param minTimeToMove min time required to get to stop or for transfer
     * @return nearest previous row in schedule or null
     */
    private fun getNearestPreviousScheduleRow(schedule: Schedule, linkedStation: ScheduleLinkedStation,
                                              currentNode: Node, minTimeToMove: Int): ScheduleRow? {
        var startTime = currentNode.timeOfArrival
        val currentLineDelay = delayEvaluator.getLineDelay(currentNode.lineCode, currentNode.lineId).toLong()

        var nearestPreviousScheduleRow: ScheduleRow? = null
        while (startTime >= -1) {
            val previousScheduleRow = findPreviousNearestRow(schedule, linkedStation, startTime)

            if (previousScheduleRow == null) {
                break
            } else {
                // is not transfer
                if (currentNode.lineId == previousScheduleRow.lineId) {
                    break
                }
            }

            val previousLineDelay = delayEvaluator.getLineDelay(previousScheduleRow.lineCode, previousScheduleRow.lineId).toLong()
            val arrivalTimeOfCurrent = currentNode.timeOfArrival + currentLineDelay
            val departureTimeOfPrevious = previousScheduleRow.departureTime + previousLineDelay

            if (departureTimeOfPrevious - minTimeToMove >= arrivalTimeOfCurrent) {
                nearestPreviousScheduleRow = previousScheduleRow
                startTime = nearestPreviousScheduleRow.departureTime - 1
            } else {
                break
            }

        }
        return nearestPreviousScheduleRow
    }

    /**
     * Get nearest row in schedule if is row available.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param currentNode current node
     * @param minTimeToMove min time required to get to stop or for transfer
     * @return nearest row in schedule or null
     */
    private fun getNearestScheduleRow(schedule: Schedule, linkedStation: ScheduleLinkedStation, currentNode: Node, minTimeToMove: Int): ScheduleRow? {
        var scheduleRow: ScheduleRow?
        var currentBestDepartureTime: Long = -1
        var nearestScheduleRow: ScheduleRow? = null
        val currentLineDelay = delayEvaluator.getLineDelay(currentNode.lineCode, currentNode.lineId).toLong()
        var startTime = currentNode.timeOfArrival

        do {
            scheduleRow = findNearestRow(schedule, linkedStation, startTime, currentNode.lineId, minTimeToMove)

            if (scheduleRow != null) {
                // is transfer
                if (currentNode.lineId != scheduleRow.lineId) {
                    val currentArrivalTime = currentNode.timeOfArrival + currentLineDelay

                    val departureDelay = delayEvaluator.getLineDelay(scheduleRow.lineCode, scheduleRow.lineId).toLong()
                    val delayedDepartureTime = scheduleRow.departureTime + departureDelay

                    if (delayedDepartureTime - minTimeToMove >= currentArrivalTime) {
                        if (nearestScheduleRow != null) {
                            when {
                                scheduleRow.departureTime > currentBestDepartureTime + minTimeToMove -> return nearestScheduleRow
                                delayedDepartureTime < currentBestDepartureTime + minTimeToMove -> {
                                    nearestScheduleRow = scheduleRow
                                    currentBestDepartureTime = delayedDepartureTime
                                    startTime = scheduleRow.departureTime + 1
                                }
                                else -> startTime = scheduleRow.departureTime + 1
                            }
                        } else {
                            nearestScheduleRow = scheduleRow
                            currentBestDepartureTime = delayedDepartureTime
                            startTime = scheduleRow.departureTime + 1
                        }
                    } else {
                        startTime = scheduleRow.departureTime + 1
                    }
                } else {
                    return scheduleRow
                }
            }
        } while (scheduleRow != null)
        return nearestScheduleRow
    }

    /**
     * Get correct schedule if live data are enabled.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param currentNode current node
     * @param minTimeToMove min time required to get to stop or for transfer
     * @return correct row in schedule
     */
    private fun getCorrectLiveScheduleRow(schedule: Schedule, linkedStation: ScheduleLinkedStation,
                                          currentNode: Node, minTimeToMove: Int): ScheduleRow? {
        val nearestPreviousScheduleRow = getNearestPreviousScheduleRow(schedule, linkedStation, currentNode, minTimeToMove)
        return nearestPreviousScheduleRow ?: getNearestScheduleRow(schedule, linkedStation, currentNode, minTimeToMove)
    }

    /**
     * Get correct schedule if live data are disabled.
     *
     * @param schedule schedule
     * @param linkedStation next station connected to current station
     * @param currentNode current node
     * @param minTimeToMove min time required to get to stop or for transfer
     * @return correct row in schedule
     */
    private fun getCorrectScheduleRow(schedule: Schedule, linkedStation: ScheduleLinkedStation, currentNode: Node, minTimeToMove: Int): ScheduleRow? {
        return findNearestRow(schedule, linkedStation, currentNode.timeOfArrival, currentNode.lineId, minTimeToMove)
    }
}
