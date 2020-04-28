package com.wenbin.demojpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//spring web test
@RestController
public class test {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}
