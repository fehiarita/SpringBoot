package com.DIO.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/")
    public String helloMessage(){

        return "Hello DIO";
    }
}
