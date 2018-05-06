package cz.vutbr.fit.core.repository;

import cz.vutbr.fit.core.model.Schedule;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, String> {
    Mono<Schedule> findByStartStationIdAndStartStopId(int startStationId, int startStopId);
}
