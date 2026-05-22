package com.example.service;

import com.example.entity.Task;
import com.example.repository.TaskRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

//    @Async
//    public CompletableFuture<List<Task>> getAllTasks() {
//        log.info("Executing getAllTasks() in thread: {}", Thread.currentThread().getName());
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } // Simulate long-running task
//        return CompletableFuture.completedFuture(taskRepository.findAll());
//    }

    public List<Task> getAllTasks() {
        log.info("Executing getAllTasks() in thread: {}", Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Simulate long-running task
        return taskRepository.findAll();
    }
}
