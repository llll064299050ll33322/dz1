package com.example.hello_spring.controller;

import com.example.hello_spring.entity.Task;
import com.example.hello_spring.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final TaskService taskService;
    private static final Logger logger = LoggerFactory.getLogger(StatsController.class);

    public StatsController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public Map<String, Integer> getTaskStatistics() {
        logger.info("Получен GET запрос на /stats в {}", LocalDateTime.now());

        List<Task> tasks = taskService.getAllTasks();

        int totalTasks = tasks.size();
        int completedTasks = (int) tasks.stream()
                .filter(Task::isCompleted)
                .count();
        int pendingTasks = totalTasks - completedTasks;

        Map<String, Integer> stats = new HashMap<>();
        stats.put("totalTasks", totalTasks);
        stats.put("completedTasks", completedTasks);
        stats.put("pendingTasks", pendingTasks);

        logger.info("Статистика задач: всего={}, выполнено={}, ожидают={}",
                totalTasks, completedTasks, pendingTasks);

        return stats;
    }
}