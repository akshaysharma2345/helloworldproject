package com.example.akshay.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
        @RequestMapping("/hello")
        public String hello()
        {
            return "Hello javaTpoint";
        }
    }









