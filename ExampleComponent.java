package com.example.hello_spring.componets;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ExampleComponent {

    public ExampleComponent() {
        System.out.println("ExampleComponent создаётся");
    }

    @PostConstruct
    public void afterCreation() {
        System.out.println("ExampleComponent создан");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("ExampleComponent удаляется");
    }
}
