package com.app.todoapp.services;

import com.app.todoapp.model.Task;
import com.app.todoapp.respository.TaskRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRespository taskRespository;

    @Autowired
    public TaskService(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }
    public List<Task> getAllTasks() {
       return taskRespository.findAll();
    }

    public void createTask(String taskName) {
        Task task = new Task();
        task.setTitle(taskName);
        task.setCompleted(false);
        taskRespository.save(task);
    }

    public void deleteTask(Long id) {
        taskRespository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRespository.findById(id).orElseThrow(()-> new IllegalArgumentException("Task not found"));
        task.setCompleted(!task.isCompleted());
        taskRespository.save(task);
    }
}
