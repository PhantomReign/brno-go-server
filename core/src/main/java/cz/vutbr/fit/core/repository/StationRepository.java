package cz.vutbr.fit.core.repository;

import cz.vutbr.fit.core.model.Station;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StationRepository extends ReactiveMongoRepository<Station, String> {
    Mono<Station> findById(int stationId);

    Flux<Station> findByLocationNear(GeoJsonPoint location, Distance distance);
}
