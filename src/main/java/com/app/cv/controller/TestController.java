package com.app.cv.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/cv-owner/test")
    public String test() {
        return "Owner service is working!";
    }
}
