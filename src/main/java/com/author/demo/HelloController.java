package com.author.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class HelloController {
    private MyService myService;

    @Autowired
    public HelloController(MyService myService) {
        this.myService = myService;
        System.out.println("Hello controller constructor " + this.myService.getMessage());
    }

    @GetMapping("hello")
    public String helloRoute() {
        System.out.println("Hello controller hello route method" + this.myService.getMessage());
        return "Hello world";
    }

    @GetMapping("/user")
    public User getUser() {
        System.out.println("User route triggered");
        User user = new User(1, "John Doe", "john@example.com");
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(user);
            System.out.println(jsonString);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return user;
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable int id) {
        return this.myService.getUserById(id);
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
