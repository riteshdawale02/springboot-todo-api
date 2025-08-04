package com.example.todo_list_demo.Service;

import org.springframework.stereotype.Service;

import com.example.todo_list_demo.Repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepo;

    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }
}
