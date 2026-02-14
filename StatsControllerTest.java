package com.example.hello_spring.controller;

import com.example.hello_spring.entity.Task;
import com.example.hello_spring.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatsControllerTest {

    @Mock
    private TaskService taskService;

    @InjectMocks
    private StatsController statsController;

    @Test
    void testGetStatistics() {
        List<Task> tasks = Arrays.asList(
                new Task(1, "Задача 1", true),
                new Task(2, "Задача 2", false),
                new Task(3, "Задача 3", true)
        );
        when(taskService.getAllTasks()).thenReturn(tasks);

        Map<String, Integer> stats = statsController.getTaskStatistics();

        assertEquals(3, stats.get("totalTasks"));
        assertEquals(2, stats.get("completedTasks"));
        assertEquals(1, stats.get("pendingTasks"));
        verify(taskService).getAllTasks();
    }

    @Test
    void testGetStatistics_Empty() {
        when(taskService.getAllTasks()).thenReturn(Arrays.asList());

        Map<String, Integer> stats = statsController.getTaskStatistics();

        assertEquals(0, stats.get("totalTasks"));
        assertEquals(0, stats.get("completedTasks"));
        assertEquals(0, stats.get("pendingTasks"));
    }
}