package com.author.demo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    private MyService myService;

    @Autowired
    public HelloController(MyService myService) {
        this.myService = myService;
        System.out.println("Hello controller constructor " + this.myService.getMessage());
    }

    @RequestMapping("hello")
    public String helloRoute() {
        System.out.println("Hello controller hello route method" + this.myService.getMessage());
        return "Hello world";
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized for HelloController!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed for HelloController!");
    }
}
