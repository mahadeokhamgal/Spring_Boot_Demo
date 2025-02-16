package com.author.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyComponent {
    private MyService myService;

    // Setter Injection
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
        this.showMessage();
    }

    public void showMessage() {
        System.out.println("In my component showMessage ->  " + myService.getMessage());
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized for MyComponent!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed for MyComponent!");
    }

}
