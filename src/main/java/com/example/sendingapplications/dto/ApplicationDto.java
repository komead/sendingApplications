package com.example.sendingapplications.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicationDto {
    private String id;
    List<ProductDto> products = new ArrayList<>();
}