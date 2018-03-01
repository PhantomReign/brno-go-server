package cz.vutbr.fit.core.io;

import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.model.wrapper.Service;
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
    public static ArrayList<Service> processServiceFile(Path pathToFile, Map<Integer, ArrayList<Long>> servicesInDays) {
        Map<Integer, ArrayList<Service>> services = getMappedServices(pathToFile);
        return updatedServices(services, servicesInDays);
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
    private static Service processServiceStopLine(String[] lineValues, int serviceCode, int lineId, int lineCode) {
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
     * @param fileLines all lines in file
     * @param index line position
     * @return {@link String} next line
     */
    private static String nextLine(List<String> fileLines, int index){
        return fileLines.size() > index + 1 ? fileLines.get(index + 1) : "";
    }

    /**
     * This function updates time information in services:
     *
     * @param services mapped services
     * @param servicesInDays mapped services available in days
     * @return {@link ArrayList} list of services with updated dates
     */
    private static ArrayList<Service> updatedServices(Map<Integer, ArrayList<Service>> services,
                                                    Map<Integer, ArrayList<Long>> servicesInDays) {

        ArrayList<Service> updatedServiceList = new ArrayList<>();

        servicesInDays.forEach((serviceCode, daysList) -> {
            ArrayList<Service> processedServiceList = new ArrayList<>();
            ArrayList<Service> serviceList = services.get(serviceCode);

            if (serviceList != null) {
                for (Service service : serviceList) {
                    for (Long date : daysList) {
                        Service updatedService = new Service(service);

                        if (updatedService.getDepartureTime() != Constant.Parser.INVALID_NUM) {
                            updatedService.setDepartureTime(updatedService.getDepartureTime() + date);
                        }
                        processedServiceList.add(updatedService);
                    }
                }
                updatedServiceList.addAll(processedServiceList);
            }
        });

        return updatedServiceList;
    }


    /**
     * This function filter services and map available ones:
     *
     * @param pathToFile path to file
     * @return {@link Map} mapped services
     */
    private static Map<Integer, ArrayList<Service>> getMappedServices(Path pathToFile) {

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

        HashMap<Integer, ArrayList<Service>> services = new HashMap<>();
        List<Service> processedServiceList = null;
        int lineId = 0;
        int lineCode = 0;
        int serviceCode = 0;

        int index = 0;

        for (String line : filteredFile) {
            String[] values = line.trim().split("\\s+");

            if (line.trim().startsWith(Constant.Parser.MARK_SERVICE_CODE) ||
                    line.trim().startsWith(Constant.Parser.MARK_SERVICE_LINE)) {

                // Update service with new info - must be done before processing new service
                if (processedServiceList != null && !processedServiceList.isEmpty()) {
                    ArrayList<Service> serviceList = services.getOrDefault(serviceCode, new ArrayList<>());
                    serviceList.addAll(processedServiceList);
                    services.put(serviceCode, serviceList);
                }

                processedServiceList = new ArrayList<>();

                if (line.trim().startsWith(Constant.Parser.MARK_SERVICE_CODE)) {
                    serviceCode = Integer.parseInt(values[0].substring(1));
                } else {
                    lineId = Integer.parseInt(values[0].substring(1));
                    lineCode = Integer.parseInt(values[2]);
                }

            } else {
                Service currentService = processServiceStopLine(values, serviceCode, lineId, lineCode);

                if (currentService != null) {
                    String nextLine = nextLine(filteredFile, index);

                    // If its possible try to create next one
                    if (!nextLine.isEmpty()) {
                        if (nextLine.trim().startsWith(Constant.Parser.MARK_SERVICE_STOP)) {
                            String[] nextValues = nextLine.trim().split("\\s+");
                            Service nextService = processServiceStopLine(nextValues, serviceCode, lineId, lineCode);

                            currentService.setTimeToNextStop(nextService.getDepartureTime() - currentService.getDepartureTime());
                            currentService.setDestinationStationId(nextService.getStartStationId());
                            currentService.setDestinationStopId(nextService.getStartStopId());
                        }
                    } else {
                        continue;
                    }
                    processedServiceList.add(currentService);
                }
            }
            index++;
        }

        return services;
    }

}
