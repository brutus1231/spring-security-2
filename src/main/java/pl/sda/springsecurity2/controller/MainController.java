package pl.sda.springsecurity2.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = { "/index"})
    public String view(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) authentication.getPrincipal();

        model.addAttribute("login", principal.getUsername());
        return "index";
    }

//    @GetMapping(value = "/login")
//    public String logout() {
//        return "index";
//    }
}
