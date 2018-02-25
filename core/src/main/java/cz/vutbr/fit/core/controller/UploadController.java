package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.io.helper.FileHelper;
import cz.vutbr.fit.core.tools.Constant;
import org.springframework.http.MediaType;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin/upload")
public class UploadController {

    @PostMapping(value = "/stops", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadStopsFile(@RequestPart("file") FilePart part) {
        if (!part.headers().getContentType().includes(MediaType.TEXT_PLAIN)) {
            return "redirect:/admin?fileincorrect";
        }

        try {
            FileHelper.saveFile(part, Constant.Upload.PATH_STOPS);
        } catch (Exception e) {
            return "redirect:/admin?filefailure";
        }
        return "redirect:/admin?filesuccess";
    }

    @PostMapping(value = "/services", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadServicesFile(@RequestPart("file") FilePart part) {
        if (!part.headers().getContentType().includes(MediaType.TEXT_PLAIN)) {
            return "redirect:/admin?fileincorrect";
        }

        try {
            FileHelper.saveFile(part, Constant.Upload.PATH_SERVICES);
        } catch (Exception e) {
            return "redirect:/admin?filefailure";
        }
        return "redirect:/admin?filesuccess";
    }


    @PostMapping(value = "/schedules", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadScheduleFile(@RequestPart("file") FilePart part) {
        if (!part.headers().getContentType().includes(MediaType.TEXT_PLAIN)) {
            return "redirect:/admin?fileincorrect";
        }

        try {
            FileHelper.saveFile(part, Constant.Upload.PATH_DAYS);
        } catch (Exception e) {
            return "redirect:/admin?filefailure";
        }
        return "redirect:/admin?filesuccess";
    }

}
