package com.example.hello_spring.service;

import com.example.hello_spring.components.ExampleComponent;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final ExampleComponent exampleComponent;

    public ExampleService(ExampleComponent exampleComponent) {
        this.exampleComponent = exampleComponent;
        System.out.println("ExampleService создан");
    }
}