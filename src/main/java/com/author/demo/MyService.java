package com.author.demo;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class MyService {
    public int counter = 0;
    public String getMessage() {
        counter++;
        return counter + " <--> Hello from MyService!";
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized for MyService!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed for MyService!");
    }
}
