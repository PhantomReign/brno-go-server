package cz.vutbr.fit.core.tools;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static long zonedTimeToEpochSec(String line, DateTimeFormatter formatter) {
        return ZonedDateTime
                .parse(line.trim().substring(1), formatter)
                .toLocalDate()
                .atStartOfDay(ZoneId.of("Europe/Prague"))
                .toEpochSecond();
    }

    public static int timeToSec(String timeString) {
        String[] values = timeString.split(":");
        return Integer.parseInt(values[0]) * 3600 + Integer.parseInt(values[1]) * 60;
    }
}
