package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListHomepage {

    // Homepage
    @RequestMapping("/home")
    public String TodoHomepage() {
        return "Welcome to TodoList App. Build on Spring Boot";
    }
}
