package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello, SonarQube!";
    }

    @GetMapping("/hello")
    public String hello() {
        // Duplicate code block 1
        String message = "Welcome to Spring Boot";
        String timestamp = java.time.LocalDateTime.now().toString();
        String result = message + " - " + timestamp;
        System.out.println("Processing request: " + result);
        return result;
    }

    @GetMapping("/welcome")
    public String welcome() {
        // Duplicate code block 2 (same as above)
        String message = "Welcome to Spring Boot";
        String timestamp = java.time.LocalDateTime.now().toString();
        String result = message + " - " + timestamp;
        System.out.println("Processing request: " + result);
        return result;
    }

    @GetMapping("/greet")
    public String greet() {
        // Duplicate code block 3 (same as above)
        String message = "Welcome to Spring Boot";
        String timestamp = java.time.LocalDateTime.now().toString();
        String result = message + " - " + timestamp;
        System.out.println("Processing request: " + result);
        return result;
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running";
    }
}
