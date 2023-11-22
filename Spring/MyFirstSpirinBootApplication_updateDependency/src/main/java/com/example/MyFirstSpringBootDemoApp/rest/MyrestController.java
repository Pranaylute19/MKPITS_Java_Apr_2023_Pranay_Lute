package com.example.MyFirstSpringBootDemoApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyrestController {
    @Value("${ash.name}")

    private String name;
    @Value("${ash.surname}")
    private String surname;
    @GetMapping("/abc")
    public String display(){
        return "Hello Dear "+name + surname;
    }
}
