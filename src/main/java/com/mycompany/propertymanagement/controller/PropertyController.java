package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {

    // localhost:8080//api/v1/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
