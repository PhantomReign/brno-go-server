package cz.vutbr.fit.core.tools;

public interface Constant {
    interface Creditials {
        String ADMIN = "admin";
        String PASSWORD = "admin";
    }

    interface Roles {
        String ADMIN = "ADMIN";
    }

    interface Password {
        int STRENGTH = 11;
    }

    interface Charset {
        String DEFAULT = "Windows-1250";
    }

    interface Upload {
        String PATH_STOPS = "upload/stops.txt";
        String PATH_SERVICES = "upload/services.txt";
        String PATH_DAYS = "upload/days.txt";
    }

    interface Parser {
        int INVALID_NUM = -1;

        String MARK_STATION_STOP = "S";
        String MARK_STATION_EXPENDABLE = "1";

        String MARK_SCHEDULE_DATE = "#";

        String MARK_SERVICE_CODE = "#";
        String MARK_SERVICE_LINE = "L";
        int MARK_SERVICE_LINE_INVALID = 0;
        String MARK_SERVICE_STOP = "Z";
        String MARK_SERVICE_AVAILABLE_STOP = "A";
    }

    interface DepartureTime {
        int TIME_CORRECTION = 3000;
    }

}
