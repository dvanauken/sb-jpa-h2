package com.dbva.demo.repository;

import com.dbva.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByNameContainingIgnoreCase(String name);
}
