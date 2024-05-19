package com.example.sb_example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {
    @GetMapping (path = "/hello/{message}")
    public String getHelloMessage(@PathVariable String message){
       String s  =  "Jai Jagannath";
       return  s+message;
    }
}
