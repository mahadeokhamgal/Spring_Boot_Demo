package com.author.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private MyService myService;

    // Setter Injection
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void showMessage() {
        System.out.println(myService.getMessage());
    }
}
