package cz.vutbr.fit.core.tools;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static long zonedTimeToEpochSec(String line, DateTimeFormatter formatter) {

        String[] parsedDate = line.trim().substring(1).split("-");
        ZoneId zoneId = ZoneId.of("Europe/Prague");

        return ZonedDateTime
                .of(Integer.parseInt(parsedDate[0]), Integer.parseInt(parsedDate[1]), Integer.parseInt(parsedDate[2]), 0, 0, 0, 0, zoneId)
                .toLocalDate().atStartOfDay(zoneId).toEpochSecond();
    }

    public static int timeToSec(String timeString) {
        String[] values = timeString.split(":");
        return Integer.parseInt(values[0]) * 3600 + Integer.parseInt(values[1]) * 60;
    }
}
