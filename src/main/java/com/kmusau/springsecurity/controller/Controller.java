package com.kmusau.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String welcome() {
        return "Hello world";
    }

    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "Welcome Admin";
    }

}
