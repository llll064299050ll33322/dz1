package com.example.hello_spring.controller;

import com.example.hello_spring.entity.Task;
import com.example.hello_spring.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskService taskService;
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks(){
        logger.info("Получен GET запрос на /tasks в {}", LocalDateTime.now());
        return taskService.getAllTasks();
    }

    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody Task newTask){
        logger.info("Получен POST запрос на /tasks в {}", LocalDateTime.now());

        if (newTask.getDescription() == null ||
                newTask.getDescription().trim().isEmpty()) {
            logger.warn("Попытка создать задачу с пустым описанием");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Описание задачи не может быть пустым или состоять только из пробелов");
        }

        Task createdTask = taskService.createTask(newTask);
        logger.info("Создана новая задача с ID: {}", createdTask.getId());
        return ResponseEntity.ok(createdTask);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task updatedTask){
        logger.info("Получен PUT запрос на /tasks/{} в {}", id, LocalDateTime.now());
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        logger.info("Получен DELETE запрос на /tasks/{} в {}", id, LocalDateTime.now());

        boolean deleted = taskService.deleteTask(id);
        if (deleted) {
            logger.info("Задача с ID {} удалена", id);
            return "Task with id " + id + " deleted";
        } else {
            logger.warn("Попытка удалить несуществующую задачу с ID {}", id);
            return "Task with id " + id + " not found";
        }
    }
}