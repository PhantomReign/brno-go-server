package cz.vutbr.fit.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Login controller class. Contains method used for login section access.
 *
 */

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
