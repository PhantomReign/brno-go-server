package cz.vutbr.fit.core.repository;

import cz.vutbr.fit.core.model.Station;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface StationRepository extends ReactiveMongoRepository<Station, String> {
    Mono<Station> findById(int stopID);
}
