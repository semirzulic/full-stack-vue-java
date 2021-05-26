package dev.semirzulic.fullstackjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/messages")

public class MessageController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Full Stack Java Development with Spring Boot & VueJS!";
    }
}
