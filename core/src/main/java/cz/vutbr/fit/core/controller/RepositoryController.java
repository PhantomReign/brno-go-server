package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.controller.abstracts.AbstractRepositoryController;
import cz.vutbr.fit.core.io.DaysParser;
import cz.vutbr.fit.core.io.ServicesParser;
import cz.vutbr.fit.core.io.StationsParser;
import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.model.Schedule;
import cz.vutbr.fit.core.model.Service;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.ScheduleRepository;
import cz.vutbr.fit.core.repository.StationRepository;
import cz.vutbr.fit.core.tools.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/repo")
public class RepositoryController extends AbstractRepositoryController {

    private final StationRepository stationRepository;
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public RepositoryController(StationRepository stationRepository, ScheduleRepository scheduleRepository) {
        this.stationRepository = stationRepository;
        this.scheduleRepository = scheduleRepository;
    }

    @PostMapping("/update")
    public String updateDatabase() {

        if (!FileHelper.fileExist(Paths.get(Constant.Upload.PATH_STOPS)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_SERVICES)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_DAYS))) {
            return "redirect:/admin?repofailure";
        }


        ArrayList<Station> stations = StationsParser.processStationsFile(Paths.get(Constant.Upload.PATH_STOPS));
        deleteStationsInDatabase(stationRepository);
        saveStationsToDatabase(stationRepository, stations);


        Map<Integer, List<Service>> services = ServicesParser.processServiceFile(Paths.get(Constant.Upload.PATH_SERVICES));
        Map<Integer, ArrayList<Long>> servicesInDays = DaysParser.parseDaysFile(Paths.get(Constant.Upload.PATH_DAYS));

        // TODO: join them together and save

        return "redirect:/admin?reposuccess";
    }

    @PostMapping("/delete")
    public String deleteDatabase() {

        deleteStationsInDatabase(stationRepository);
        return "redirect:/admin?reposuccess";
    }

}
