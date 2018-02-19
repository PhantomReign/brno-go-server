package cz.vutbr.fit.core.io.helper;

import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.StationRepository;

import java.util.ArrayList;

public class KordisHelper {

    public static void saveStationsToDatabase(StationRepository stationRepository, ArrayList<Station> stations) {
        stationRepository.saveAll(stations).subscribe();
    }

    public static void deleteStationsInDatabase(StationRepository stationRepository) {
        if (stationRepository == null) System.out.println("KURVAAAA");
        stationRepository.deleteAll().subscribe();
    }
}
