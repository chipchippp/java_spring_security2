package com.example.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @GetMapping("/loginPage")
    public String loginPage() {
        return "login";
    }
    @PostMapping("/loginPage")
    public String loginPagePost() {
        return "login";
    }
}
