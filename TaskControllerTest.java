package com.example.hello_spring.controller;

import com.example.hello_spring.entity.Task;
import com.example.hello_spring.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskControllerTest {

    @Mock
    private TaskService taskService;

    @InjectMocks
    private TaskController taskController;

    @Test
    void testGetAllTasks() {
        when(taskService.getAllTasks()).thenReturn(Arrays.asList(
                new Task(1, "Задача 1", false),
                new Task(2, "Задача 2", true)
        ));

        List<Task> tasks = taskController.getAllTasks();

        assertEquals(2, tasks.size());
        verify(taskService).getAllTasks();
    }

    @Test
    void testCreateTask_Valid() {
        Task newTask = new Task(0, "Описание", false);
        when(taskService.createTask(any())).thenReturn(new Task(1, "Описание", false));

        ResponseEntity<?> response = taskController.createTask(newTask);

        assertEquals(200, response.getStatusCode().value());
        verify(taskService).createTask(any());
    }

    @Test
    void testCreateTask_Invalid() {
        Task newTask = new Task(0, "", false); // Пустое описание

        ResponseEntity<?> response = taskController.createTask(newTask);

        assertEquals(400, response.getStatusCode().value());
        verify(taskService, never()).createTask(any());
    }

    @Test
    void testDeleteTask() {
        when(taskService.deleteTask(1)).thenReturn(true);

        String result = taskController.deleteTask(1);

        assertEquals("Task with id 1 deleted", result);
        verify(taskService).deleteTask(1);
    }
}