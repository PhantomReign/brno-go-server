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
        String PATH_SCHEDULE = "upload/schedule.txt";
    }

    interface Parser {
        String MARK_STOP = "S";
        String MARK_UNREQUIRED_STATION = "1";
    }

}
