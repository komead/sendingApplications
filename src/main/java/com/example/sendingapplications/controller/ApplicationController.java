package com.example.sendingapplications.controller;

import com.example.sendingapplications.dto.ApplicationDto;
import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.service.ApplicationService;
import com.example.sendingapplications.transformers.ApplicationTransformer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/application")
@AllArgsConstructor
public class ApplicationController {
    private ApplicationService applicationService;

//    @PutMapping("/new")
//    public void add(@RequestBody Application application) {
//        applicationService.add(application);
//    }

    @GetMapping("/all")
    public List<ApplicationDto> getAll() {
        List<ApplicationDto> forSend = new ArrayList<>();

        ApplicationTransformer applicationTransformer = new ApplicationTransformer();
        for (Application appl : applicationService.getAll())
            forSend.add(applicationTransformer.toDto(appl));

        return forSend;
    }
}