package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * The Rest server  application to create few APIs.
 */

@RestController
public class RestControllerApp {
    @RequestMapping("/")
    public String home() {
        return "Hello Readers";
    }
}
