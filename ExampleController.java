package com.example.hello_spring.controller;

import com.example.hello_spring.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
        System.out.println("ExampleController создан");
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("Получен запрос /test");
        return "Проведите проверку";
    }
}
