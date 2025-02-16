package com.author.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void asyncMethod() {
        System.out.println("Executing Async Task - " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Async Task Completed!");
    }
}
