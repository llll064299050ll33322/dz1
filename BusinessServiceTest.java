package com.example.hello_spring.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceTest {

    @Mock
    private ExternalApiService externalApiService;  // Мок API

    @InjectMocks
    private BusinessService businessService;

    @Test
    void testGetData() {
        when(externalApiService.getExternalData()).thenReturn("{\"id\":1}");

        String result = businessService.getData();

        assertEquals("{\"id\":1}", result);
        verify(externalApiService).getExternalData();
    }

    @Test
    void testSendData_Success() {
        Map<String, String> data = new HashMap<>();
        data.put("title", "Тест");

        when(externalApiService.postExternalData(any())).thenReturn("{\"id\":1}");

        boolean result = businessService.sendData(data);

        assertTrue(result);
        verify(externalApiService).postExternalData(any());
    }

    @Test
    void testSendData_Failure() {
        when(externalApiService.postExternalData(any()))
                .thenThrow(new RuntimeException("Ошибка API"));

        boolean result = businessService.sendData(new HashMap<>());

        assertFalse(result);
        verify(externalApiService).postExternalData(any());
    }
}