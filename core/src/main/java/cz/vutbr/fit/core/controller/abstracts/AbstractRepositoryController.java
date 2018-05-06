package cz.vutbr.fit.core.controller.abstracts;

import cz.vutbr.fit.core.model.Schedule;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.ScheduleRepository;
import cz.vutbr.fit.core.repository.StationRepository;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractRepositoryController {

    protected void saveStationsToDatabase(StationRepository stationRepository, ArrayList<Station> stations) {
        stationRepository.saveAll(stations).subscribe();
    }

    protected void deleteStationsInDatabase(StationRepository stationRepository) {
        stationRepository.deleteAll().subscribe();
    }

    protected void saveSchedulesToDatabase(ScheduleRepository scheduleRepository, Collection<Schedule> schedules) {
        scheduleRepository.deleteAll().block();
        scheduleRepository.saveAll(schedules).subscribe();
    }

    protected void deleteSchedulesInDatabase(ScheduleRepository scheduleRepository) {
        scheduleRepository.deleteAll().subscribe();
    }

}
