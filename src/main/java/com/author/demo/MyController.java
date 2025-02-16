package com.author.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Controller
@RequestMapping("/api")
public class MyController {
    
    @GetMapping("/message")
    @ResponseBody  // Required to return JSON
    public String getMessage() {
        return "Hello from Controller!";
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized for MyController!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed for MyController!");
    }
}

