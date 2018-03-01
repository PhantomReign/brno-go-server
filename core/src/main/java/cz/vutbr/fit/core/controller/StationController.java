package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/brnogo/api")
public class StationController {

    private final StationRepository stationRepository;

    @Autowired
    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @RequestMapping("/stations")
    public Flux<Station> getAllStations() {
        return stationRepository.findAll();
    }
}
