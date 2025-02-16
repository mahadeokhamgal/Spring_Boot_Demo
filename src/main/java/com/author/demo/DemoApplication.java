package com.author.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
    public void init() {
        System.out.println("Bean Initialized for DemoApplication!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed for DemoApplication!");
    }
}
