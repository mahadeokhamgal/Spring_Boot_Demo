package com.author.demo;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable(value = "users", key = "#id")
    public User getUserById(int id) {
        System.out.println("Fetching user from DB...");
        return new User(id, "John Doe", "john.email.com");
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
