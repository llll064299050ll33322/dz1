package com.example.hello_spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate;

    public ExternalApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String getExternalData() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        return restTemplate.getForObject(url, String.class);
    }

    public String postExternalData(Object data) {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.postForObject(url, data, String.class);
    }
}