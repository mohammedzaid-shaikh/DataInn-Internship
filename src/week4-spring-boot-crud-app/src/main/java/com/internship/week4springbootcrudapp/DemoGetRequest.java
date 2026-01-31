package com.internship.week4springbootcrudapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class DemoGetRequest {
    @GetMapping("/")
    public String hello() {
        return "Learning Java Spring Boot.";
    }
}
