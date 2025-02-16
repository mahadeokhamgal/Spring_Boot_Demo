package com.author.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    private MyService myService;

    @Autowired
    public HelloController(MyService myService) {
        this.myService = myService;
    }

    @RequestMapping("hello")
    public String requestMethodName() {
        System.out.println(this.myService.getMessage());
        return "Hello world";
    }
}
