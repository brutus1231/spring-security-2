package pl.sda.springsecurity2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.springsecurity2.model.UserEntity;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String view() {
        return "registration";
    }

    @PostMapping("/register")
    public String createUser(@ModelAttribute("user") UserEntity user) {
        return "login";
    }
}
