package com.sid.proj.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DummyController {

    @RequestMapping("/dummy")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}