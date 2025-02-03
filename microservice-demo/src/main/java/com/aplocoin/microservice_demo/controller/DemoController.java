package com.aplocoin.microservice_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/microservice-demo")
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello";
    }

}
