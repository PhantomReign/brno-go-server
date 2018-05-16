package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.controller.abstracts.AbstractRepositoryController;
import cz.vutbr.fit.core.io.DaysParser;
import cz.vutbr.fit.core.io.SchedulesParser;
import cz.vutbr.fit.core.io.ServicesParser;
import cz.vutbr.fit.core.io.StationsParser;
import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.model.*;
import cz.vutbr.fit.core.model.wrapper.Service;
import cz.vutbr.fit.core.repository.ScheduleRepository;
import cz.vutbr.fit.core.repository.StationRepository;
import cz.vutbr.fit.core.tools.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Paths;
import java.util.*;

/**
 * Repository controller class. Contains methods used for database manipulation.
 *
 */

@Controller
@RequestMapping("/admin/repo")
public class RepositoryController extends AbstractRepositoryController {

    private final StationRepository stationRepository;
    private final ScheduleRepository scheduleRepository;
    private final CacheManager cacheManager;


    @Autowired
    public RepositoryController(StationRepository stationRepository, ScheduleRepository scheduleRepository,
                                CacheManager cacheManager) {
        this.stationRepository = stationRepository;
        this.scheduleRepository = scheduleRepository;
        this.cacheManager = cacheManager;
    }

    @PostMapping("/updateStations")
    public String updateStationDatabase() {

        if (!FileHelper.fileExist(Paths.get(Constant.Upload.PATH_STOPS))) {
            return "redirect:/admin?repofailure";
        }

        cacheManager.getCache("stations").clear();

        ArrayList<Station> stations = StationsParser.processStationsFile(Paths.get(Constant.Upload.PATH_STOPS));
        saveStationsToDatabase(stationRepository, stations);

        return "redirect:/admin?reposuccess";
    }

    @PostMapping("/updateSchedules")
    public String updateScheduleDatabase() {

        if (!FileHelper.fileExist(Paths.get(Constant.Upload.PATH_STOPS)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_SERVICES)) ||
                !FileHelper.fileExist(Paths.get(Constant.Upload.PATH_DAYS))) {
            return "redirect:/admin?repofailure";
        }

        cacheManager.getCache("schedules").clear();

        Map<Integer, ArrayList<Long>> servicesInDays = DaysParser.parseDaysFile(Paths.get(Constant.Upload.PATH_DAYS));
        ArrayList<Service> services = ServicesParser.processServiceFile(Paths.get(Constant.Upload.PATH_SERVICES), servicesInDays);
        Map<Integer, Schedule> mappedSchedule = SchedulesParser.getScheduleMap(services);

        saveSchedulesToDatabase(scheduleRepository, mappedSchedule.values());

        return "redirect:/admin?reposuccess";
    }

    @PostMapping("/deleteStations")
    public String deleteStationDatabase() {
        cacheManager.getCache("stations").clear();
        deleteStationsInDatabase(stationRepository);
        return "redirect:/admin?reposuccess";
    }

    @PostMapping("/deleteSchedules")
    public String deleteScheduleDatabase() {
        cacheManager.getCache("schedules").clear();
        deleteSchedulesInDatabase(scheduleRepository);
        return "redirect:/admin?reposuccess";
    }

}
