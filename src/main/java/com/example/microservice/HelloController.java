package com.example.microservice;

import org.springframework.web.bind.GetMapping;
import org.springframework.web.bind.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello from Microservice!";
    }
}
