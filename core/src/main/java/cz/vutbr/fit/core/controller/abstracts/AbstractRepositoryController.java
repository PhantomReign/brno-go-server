package cz.vutbr.fit.core.controller.abstracts;


import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.StationRepository;

import java.util.ArrayList;

public abstract class AbstractRepositoryController {

    public void saveStationsToDatabase(StationRepository stationRepository, ArrayList<Station> stations) {
        stationRepository.saveAll(stations).subscribe();
    }

    public void deleteStationsInDatabase(StationRepository stationRepository) {
        stationRepository.deleteAll().subscribe();
    }

}
