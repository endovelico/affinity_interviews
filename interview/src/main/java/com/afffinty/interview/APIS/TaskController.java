package com.afffinty.interview.APIS;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    // In-memory storage (pretend this is a DB)
    private Map<Integer, Task> db = new ConcurrentHashMap<>();
    private AtomicInteger idGenerator = new AtomicInteger(1);

    // =========================
    // 1. CREATE TASK (COMPLETE THIS)
    // =========================
    @PostMapping
    public Task createTask(@RequestBody TaskRequest request) {

        // TODO:
        // 1. generate ID
        // 2. create Task
        // 3. store in db
        // 4. return created task

        return null;
    }

    // =========================
    // 2. GET ALL TASKS (COMPLETE THIS)
    // =========================
    @GetMapping
    public List<Task> getAllTasks() {

        // TODO: return all tasks

        return null;
    }

    // =========================
    // 3. GET TASK BY ID (COMPLETE THIS)
    // =========================
    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {

        // TODO:
        // return task if exists
        // otherwise return null or throw exception

        return null;
    }

    // =========================
    // 4. DELETE TASK (COMPLETE THIS)
    // =========================
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {

        // TODO: remove task from db
    }
}