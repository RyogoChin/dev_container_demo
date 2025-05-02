package com.aiful.ryogo.demo.dev_container_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @PostMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
