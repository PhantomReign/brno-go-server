package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.io.StationsParser;
import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.io.helper.KordisHelper;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.StationRepository;
import cz.vutbr.fit.core.tools.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Paths;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin/repo")
public class RepositoryController {

    private final StationRepository stationRepository;

    @Autowired
    public RepositoryController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @PostMapping("/update")
    public String updateDatabase() {

        if (!FileHelper.fileExist(Paths.get(Constant.Upload.PATH_STOPS)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_SERVICES)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_SCHEDULE))) {
            return "redirect:/admin?repofailure";
        }

        ArrayList<Station> stations = StationsParser.processStationsFile(Paths.get(Constant.Upload.PATH_STOPS));
        KordisHelper.deleteStationsInDatabase(stationRepository);
        KordisHelper.saveStationsToDatabase(stationRepository, stations);

        return "redirect:/admin?reposuccess";
    }

    @PostMapping("/delete")
    public String deleteDatabase() {

        System.out.println("PRESS");
        KordisHelper.deleteStationsInDatabase(stationRepository);

        return "redirect:/admin?reposuccess";
    }

}
