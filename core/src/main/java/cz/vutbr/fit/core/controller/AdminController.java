package cz.vutbr.fit.core.controller;

import cz.vutbr.fit.core.tools.Constant;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Admin controller class. Contains method for accessing admin section.
 *
 */

@Controller
@Secured(Constant.Roles.ADMIN)
public class AdminController {
    @RequestMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }

}
