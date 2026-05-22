package com.example.service;

import com.example.entity.Task;
import com.example.repository.TaskRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Async("taskExecutor")
    public CompletableFuture<List<Task>> getAllTasks() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Simulate long-running task
        return CompletableFuture.completedFuture(taskRepository.findAll());
    }

}
