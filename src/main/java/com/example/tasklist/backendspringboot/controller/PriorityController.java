package com.example.tasklist.backendspringboot.controller;

import com.example.tasklist.backendspringboot.entity.Category;
import com.example.tasklist.backendspringboot.repository.PriorityRepository;
import javafx.scene.layout.Priority;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/priority")
public class PriorityController {

    private PriorityRepository priorityRepository;

    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @GetMapping("/test")
    public List<Priority> test() {
        List<Priority> list = priorityRepository.findAll();

        return list;
    }

    @PostMapping("/add")
    public void add(@RequestBody Priority priority){
        priorityRepository.save(priority);
    }
}
