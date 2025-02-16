package com.author.demo;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public int counter = 0;
    public String getMessage() {
        counter++;
        return counter + " <--> Hello from MyService!";
    }
}
