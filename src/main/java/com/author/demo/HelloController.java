package com.author.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    @RequestMapping("hello")
    public String requestMethodName() {
        return "Hello world";
    }
}
