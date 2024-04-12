package com.example.sendingapplications.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicationDto {
    private String id;
    List<ProductForApplicationDto> products = new ArrayList<>();

    public void addProduct(ProductForApplicationDto productForApplicationDto) {
        products.add(productForApplicationDto);
    }
}