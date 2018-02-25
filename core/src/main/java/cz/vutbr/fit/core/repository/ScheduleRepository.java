package cz.vutbr.fit.core.repository;

import cz.vutbr.fit.core.model.Schedule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, String> {
}
