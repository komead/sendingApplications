package com.example.sendingapplications.controller;

import com.example.sendingapplications.service.BoxService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/box")
@AllArgsConstructor
public class BoxController {
    private BoxService boxService;

    @GetMapping("/{barcode}")
    public Map<String, List<String>> getContentByBarcode(@PathVariable(value = "barcode") String barcode) {
        System.out.println(barcode);
        return Map.of("items", boxService.getContentByBarcode(barcode));
    }
}