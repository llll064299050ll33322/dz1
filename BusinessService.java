package com.example.hello_spring.service;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    private final ExternalApiService externalApiService;

    public BusinessService(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    public String getData() {
        return externalApiService.getExternalData();
    }

    public boolean sendData(Object data) {
        try {
            String response = externalApiService.postExternalData(data);
            return response != null && !response.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }
}