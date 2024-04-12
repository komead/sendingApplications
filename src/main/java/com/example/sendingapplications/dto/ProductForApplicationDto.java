package com.example.sendingapplications.dto;

import lombok.Data;

@Data
public class ProductForApplicationDto {
    private String title;
    private String gtin;
    private int count;
}