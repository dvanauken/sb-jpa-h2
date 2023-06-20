package com.dbva.demo.controller;

import com.dbva.demo.repository.TaskRepository;
import com.dbva.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(@RequestParam(required = false) String name) {
        try {
            List<Task> tasks = new ArrayList<Task>();

            if (name == null)
                taskRepository.findAll().forEach(tasks::add);
            else
                taskRepository.findByNameContainingIgnoreCase(name).forEach(tasks::add);

            if (tasks.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(tasks, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Other CRUD operations here, similar to your TutorialController...
}
