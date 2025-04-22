package com.app.todoapp.respository;

import com.app.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRespository extends JpaRepository<Task, Long> {

}
