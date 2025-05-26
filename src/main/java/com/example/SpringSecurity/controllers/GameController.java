package com.example.SpringSecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("")
    public String Home(){
        return  "Home ";
    }
}
