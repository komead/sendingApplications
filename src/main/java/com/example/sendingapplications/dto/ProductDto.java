package com.example.sendingapplications.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String title;
    private String gtin;
    private int count;
}