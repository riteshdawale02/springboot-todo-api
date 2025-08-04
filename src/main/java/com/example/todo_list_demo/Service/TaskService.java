package com.example.todo_list_demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo_list_demo.Entity.Task;
import com.example.todo_list_demo.Repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepo;

    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getAllTasks(){
        return taskRepo.findAll(); 
    }
    
    public Task getTaskById(Long id){
        return taskRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task createTask(Task task){
        return taskRepo.save(task);
    }

    public void deleteTaskById(Long id){
        taskRepo.deleteById(id);
    }

}
