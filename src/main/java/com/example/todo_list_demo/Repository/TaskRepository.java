package com.example.todo_list_demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo_list_demo.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}