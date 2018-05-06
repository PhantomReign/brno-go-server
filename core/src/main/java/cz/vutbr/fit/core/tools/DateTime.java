package cz.vutbr.fit.core.tools;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    /**
     * Get epoch time in seconds from line.
     *
     * @param line string containing date
     * @return epoch time in seconds
     */
    public static long zonedTimeToEpochSec(String line) {
        String[] parsedDate = line.trim().substring(1).split("-");
        ZoneId zoneId = ZoneId.of("Europe/Prague");

        return ZonedDateTime
                .of(Integer.parseInt(parsedDate[0]), Integer.parseInt(parsedDate[1]), Integer.parseInt(parsedDate[2]), 0, 0, 0, 0, zoneId)
                .toLocalDate().atStartOfDay(zoneId).toEpochSecond();
    }

    /**
     * Get time in seconds from string.
     *
     * @param timeString string containing time
     * @return time in seconds
     */
    public static int timeToSec(String timeString) {
        String[] values = timeString.split(":");
        return Integer.parseInt(values[0]) * 3600 + Integer.parseInt(values[1]) * 60;
    }

    /**
     * Get formatted time.
     *
     * @param epochSeconds epoch time in seconds
     * @return time string in format HH:mm
     */
    public static String epochSecToZonedTimeString(long epochSeconds) {

        Instant instant = Instant.ofEpochSecond(epochSeconds);
        ZoneId zoneId = ZoneId.of("Europe/Prague");
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);

        return DateTimeFormatter.ofPattern("HH:mm").format(zonedDateTime);
    }
}
