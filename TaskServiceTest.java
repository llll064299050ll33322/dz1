package com.example.hello_spring.service;

import com.example.hello_spring.entity.Task;
import com.example.hello_spring.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    void testGetAllTasks() {
        when(taskRepository.findAll()).thenReturn(Arrays.asList(
                new Task(1, "Задача 1", false),
                new Task(2, "Задача 2", true)
        ));


        List<Task> tasks = taskService.getAllTasks();


        assertEquals(2, tasks.size());
        verify(taskRepository).findAll();
    }

    @Test
    void testCreateTask() {
        Task newTask = new Task(0, "Тест", false);
        when(taskRepository.save(any())).thenReturn(new Task(1, "Тест", false));

        Task saved = taskService.createTask(newTask);

        assertEquals(1, saved.getId());
        verify(taskRepository).save(any());
    }
}