package com.example.sendingapplications.controller;

import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
@AllArgsConstructor
public class ApplicationController {
    private ApplicationService applicationService;

    @PutMapping("/new")
    public void add(@RequestBody Application application) {
        applicationService.add(application);
    }

    @GetMapping("/all")
    public List<Application> getAll() {
        return applicationService.getAll();
    }
}
