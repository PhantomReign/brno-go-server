package cz.vutbr.fit.core.io;

import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.model.Service;
import cz.vutbr.fit.core.tools.Constant;
import cz.vutbr.fit.core.tools.DateTime;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ServicesParser {

    /**
     * Process file containing information about service:
     *
     * @param pathToFile path to file
     * @return {@link Map} map of services
     */
    public static Map<Integer, List<Service>> processServiceFile(Path pathToFile) {

        // filter stations - discard unavailable
        List<String> filteredFile = FileHelper.fromPath(pathToFile)
                .filter(line -> {
                    String[] values = line.trim().split("\\s+");
                    return (line.trim().startsWith(Constant.Parser.MARK_SERVICE_STOP)
                            && !values[1].startsWith(Constant.Parser.MARK_STATION_EXPENDABLE)
                            && values[5].equals(Constant.Parser.MARK_SERVICE_AVAILABLE_STOP))
                            || line.trim().startsWith(Constant.Parser.MARK_SERVICE_CODE)
                            || (line.trim().startsWith(Constant.Parser.MARK_SERVICE_LINE)
                            && Integer.parseInt(values[2]) != Constant.Parser.MARK_SERVICE_LINE_INVALID);
                })
                .toStream()
                .collect(Collectors.toList());

        HashMap<Integer, List<Service>> services = new HashMap<>();
        List<Service> processedLineList = null;
        int lineId = 0;
        int lineCode = 0;
        int serviceCode = 0;

        for (String line : filteredFile) {
            String[] values = line.split("\\s+");

            if (!line.trim().startsWith(Constant.Parser.MARK_SERVICE_CODE)) {

                // Update service with new info - must be done before processing new service
                if (processedLineList != null && !processedLineList.isEmpty()) {
                    List<Service> lineList = services.getOrDefault(serviceCode, new ArrayList<>());
                    lineList.addAll(processedLineList);
                    services.put(serviceCode, lineList);
                }

                processedLineList = new ArrayList<>();
                serviceCode = Integer.parseInt(values[0].substring(1));
            } else if (!line.trim().startsWith(Constant.Parser.MARK_SERVICE_LINE)) {

                // Update service with new info - must be done before processing new service line
                if (processedLineList != null && !processedLineList.isEmpty()) {
                    List<Service> lineList = services.getOrDefault(serviceCode, new ArrayList<>());
                    lineList.addAll(processedLineList);
                    services.put(serviceCode, lineList);
                }                processedLineList = new ArrayList<>();

                lineId = Integer.parseInt(values[0].substring(1));
                lineCode = Integer.parseInt(values[2]);
            } else {
                Service currentService = processServiceStopLine(values, serviceCode, lineId, lineCode);

                if (currentService != null) {
                    Service nextService;
                    String nextLine = nextLine(filteredFile, line);
                    // If its possible try to create next one
                    if (!nextLine.isEmpty()) {
                        if (nextLine.trim().startsWith(Constant.Parser.MARK_SERVICE_STOP)) {
                            String[] nextValues = nextLine.split("\\s+");
                            nextService = processServiceStopLine(nextValues, serviceCode, lineId, lineCode);

                            currentService.setTimeToNextStop(nextService.getDepartureTime() - currentService.getDepartureTime());
                            currentService.setDestinationStationId(nextService.getStartStationId());
                            currentService.setDestinationStopId(nextService.getStartStopId());
                        }
                    }
                    processedLineList.add(currentService);
                }
            }
        }
        return services;
    }


    /**
     * Process string line containing service stop line information in following format:
     *
     * <code>Z01 09410 002 05:16 05:16 N MN NN PN</code>
     *
     * @param lineValues parsed line containing required information.
     * @param serviceCode code of service.
     * @param lineId id of line.
     * @return {@link Service} instance.
     */
    private static Service processServiceStopLine(String[] lineValues, int serviceCode, int lineId, int lineCode) throws IllegalArgumentException {
        Service service = new Service();

        try {
            service.setCode(serviceCode);
            service.setLineCode(lineCode);
            service.setLineId(lineId);
            service.setStartStationId(Integer.parseInt(lineValues[1]));
            service.setStartStopId(Integer.parseInt(lineValues[2]));
            service.setDepartureTime(DateTime.timeToSec(lineValues[3]));
        } catch (Exception e) {
            throw new IllegalArgumentException("Service line starting with: " + lineValues[0] + " " + lineValues[1] + " ..., has illegal format.");
        }

        return service;
    }

    /**
     * Find next line in file:
     *
     * @param list all lines in file
     * @return {@link String} nextLine
     */
    private static String nextLine(List<String> list, String line){
        int nextIndex = list.indexOf(line) + 1;
        return list.size() < nextIndex ? "" : list.get(nextIndex);
    }

}
