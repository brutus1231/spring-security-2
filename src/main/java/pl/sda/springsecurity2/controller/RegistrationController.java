package pl.sda.springsecurity2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.springsecurity2.model.UserEntity;
import pl.sda.springsecurity2.service.UserBo;

@Controller
@RequiredArgsConstructor
public class RegistrationController {

    private final UserBo userBo;

    @GetMapping("/register")
    public String view() {
        return "registration";
    }

    @PostMapping("/register")
    public String createUser(@ModelAttribute("user") UserEntity user) {

        userBo.create(user);
        return "login";
    }
}
