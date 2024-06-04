package com.example.sendingapplications.controller;

import com.example.sendingapplications.dto.ApplicationDto;
import com.example.sendingapplications.dto.CompletedApplication;
import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.service.ApplicationService;
import com.example.sendingapplications.service.BoxService;
import com.example.sendingapplications.service.ProductService;
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
    private BoxService boxService;
    private ProductService productService;

//    @PutMapping("/new")
//    public void add(@RequestBody Application application) {
//        applicationService.add(application);
//    }

    @GetMapping("/all")
    public List<ApplicationDto> getAll() {
        List<ApplicationDto> forSend = new ArrayList<>();

        ApplicationTransformer applicationTransformer = new ApplicationTransformer();
        for (Application appl : applicationService.getAllByCompleted(false))
            forSend.add(applicationTransformer.toDto(appl));

        return forSend;
    }

    @PostMapping("/json")
    public void completeApplication(@RequestBody CompletedApplication completedApplication) {
        System.out.println(completedApplication.getProposal_id());

        applicationService.changeStatus(completedApplication.getProposal_id());

        List<String> usedBarcodes = new ArrayList<>();
        usedBarcodes.addAll(completedApplication.getGtins());

        productService.setUsed(usedBarcodes);
    }
}