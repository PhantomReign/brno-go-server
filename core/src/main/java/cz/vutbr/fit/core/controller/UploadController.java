package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.io.StationsParser;
import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.io.helper.KordisHelper;
import cz.vutbr.fit.core.model.Station;
import cz.vutbr.fit.core.repository.StationRepository;
import cz.vutbr.fit.core.tools.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin/upload")
public class UploadController {

    private final StationRepository stationRepository;

    @Autowired
    public UploadController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }


    @PostMapping(value = "/stops", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadStopsFile(@RequestPart("file") FilePart part) throws IOException {
        FileHelper.saveFile(part, Constant.Upload.PATH_STOPS);

        ArrayList<Station> stations = StationsParser.processStationsFile(Paths.get(Constant.Upload.PATH_STOPS));

        KordisHelper.deleteStationsInDatabase(stationRepository);
        KordisHelper.saveStationsToDatabase(stationRepository, stations);

        /*for (Station station: stations) {
            System.out.println(station.getName() + " " + station.getStops().toString());
        }*/


        return "redirect:/admin?success";
    }

    @PostMapping(value = "/services", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadServicesFile(@RequestPart("file") FilePart part) throws IOException {
        FileHelper.saveFile(part, Constant.Upload.PATH_SERVICES);

        return "redirect:/admin?success";
    }

    /*@PostMapping(value = "/station", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadSingleFile(@RequestPart("file") Mono<FilePart> part) throws IOException {

        //String name = filePart.name();
        //String contentType = filePart.headers().getContentType().toString();

        /*part.flux().subscribe(filePart -> {
            ByteArrayOutputStream contentStream = new ByteArrayOutputStream();
            DataBufferUtils.write(filePart.content(), contentStream).blockFirst();
            System.out.println(contentStream.toByteArray());
        });

        System.out.println("START");

        InputStream bytes;
        Part file = part.log().block(Duration.ofMillis(4000));
        System.out.println("AFTER BLOCK");

        bytes = file.content().blockFirst().asInputStream();
        System.out.println("AFTER BYTES");

        System.out.println(bytes);


        return "redirect:/admin";
    }*/
}
