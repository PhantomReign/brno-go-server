package cz.vutbr.fit.core.io;

import cz.vutbr.fit.core.model.Schedule;
import cz.vutbr.fit.core.model.wrapper.ScheduleLinkedStation;
import cz.vutbr.fit.core.model.wrapper.ScheduleRow;
import cz.vutbr.fit.core.model.wrapper.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SchedulesParser {

    /**
     * Create Map of Schedule items:
     *
     * @param services list of services
     * @return {@link Map} return mapped schedule
     */
    public static Map<Integer, Schedule> getScheduleMap(ArrayList<Service> services) {
        Map<Integer, Schedule> mappedSchedule = new HashMap<>();

        services.forEach(service -> {

            int hashOfService = Objects.hash(service.getStartStationId(), service.getStartStopId());
            Schedule schedule = mappedSchedule.getOrDefault(hashOfService, null);

            // when new - create
            if (schedule == null) {
                schedule = new Schedule();
                schedule.setStartStationId(service.getStartStationId());
                schedule.setStartStopId(service.getStartStopId());
            }

            // create row entry and add it to schedule
            ScheduleRow scheduleRow = new ScheduleRow();
            scheduleRow.setDestinationStationId(service.getDestinationStationId());
            scheduleRow.setDestinationStopId(service.getDestinationStopId());
            scheduleRow.setLineCode(service.getLineCode());
            scheduleRow.setLineId(service.getLineId());
            scheduleRow.setDepartureTime(service.getDepartureTime());
            scheduleRow.setTimeToNextStop(service.getTimeToNextStop());

            schedule.addRow(scheduleRow);

            // create next stop entry and add it to schedule
            ScheduleLinkedStation nextStop = new ScheduleLinkedStation();
            nextStop.setLineId(service.getLineId());
            nextStop.setLineCode(service.getLineCode());
            nextStop.setStationId(service.getDestinationStationId());
            nextStop.setStopId(service.getDestinationStopId());

            schedule.addDifferentNextStop(nextStop);

            // add schedule to map
            mappedSchedule.put(hashOfService, schedule);
        });

        return mappedSchedule;
    }
}
