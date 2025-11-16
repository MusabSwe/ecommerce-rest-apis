package com.musab.ecommerce_rest_apis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musab.ecommerce_rest_apis.entities.Message;

@RestController
public class MessageController {

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello World!");
    }
}
