package com.aiful.ryogo.demo.dev_container_demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @PostMapping("hello")
    public String hello() {
        return "Hello World!";
    }
}
