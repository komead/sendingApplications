package com.example.sendingapplications.controller;

import com.example.sendingapplications.dto.ApplicationDto;
import com.example.sendingapplications.dto.CompletedApplication;
import com.example.sendingapplications.dto.ReceivedApplication;
import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.service.ApplicationService;
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
    private ProductService productService;

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
        applicationService.changeStatus(completedApplication.getProposal_id());

        List<String> usedBarcodes = new ArrayList<>();
        usedBarcodes.addAll(completedApplication.getGtins());

        productService.setUsed(usedBarcodes);
    }

    @PostMapping("/complete")
    public void complete(@RequestBody ReceivedApplication receivedApplication) {
        applicationService.changeStatus(receivedApplication.getNumber());

        productService.useProducts(receivedApplication);
    }
}