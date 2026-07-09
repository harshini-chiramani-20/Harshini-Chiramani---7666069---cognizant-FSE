package com.cognizant.spring_rest_handson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_rest_handson.model.Country;

@RestController
public class HelloController {

    @GetMapping("/country")
    public Country getCountry() {

        return new Country("IN", "India");

    }
}