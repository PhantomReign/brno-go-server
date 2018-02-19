package cz.vutbr.fit.core.repository;

import cz.vutbr.fit.core.model.Station;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StationRepository extends ReactiveMongoRepository<Station, String> {
}
