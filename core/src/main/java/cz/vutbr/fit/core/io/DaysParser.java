package cz.vutbr.fit.core.io;

import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.tools.Constant;
import cz.vutbr.fit.core.tools.DateTime;

import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class DaysParser {

    /**
     * Process file containing information about available services:
     **
     * @param pathToFile path to file
     * @return {@link Map} map of available services in that day
     */
    public static Map<Integer, ArrayList<Long>> parseDaysFile(Path pathToFile) {
        Map<Integer, ArrayList<Long>> mappedSchedule = new HashMap<>();

        // Get File Content
        List<String> fileContent = FileHelper.fromPath(pathToFile)
                .toStream()
                .collect(Collectors.toList());

        long currentDayInSeconds = Constant.Parser.INVALID_NUM;
        int serviceCode = Constant.Parser.INVALID_NUM;

        for (String line : fileContent) {
            try {
                if (line.trim().startsWith(Constant.Parser.MARK_SCHEDULE_DATE)) {
                    currentDayInSeconds = DateTime.zonedTimeToEpochSec(line, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                } else {
                    serviceCode = Integer.parseInt(line.trim());
                    ArrayList<Long> availableInDaysList = mappedSchedule.getOrDefault(serviceCode, new ArrayList<>());
                    if (currentDayInSeconds != Constant.Parser.INVALID_NUM) {
                        availableInDaysList.add(currentDayInSeconds);
                    }
                    mappedSchedule.put(serviceCode, availableInDaysList);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Line: " + line + " has illegal format.");
            }
        }

        return mappedSchedule;
    }
}
