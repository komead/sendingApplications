package com.example.sendingapplications.service;

import com.example.sendingapplications.dto.ReceivedApplication;

import java.util.List;

public interface ProductService {
    void setUsed(List<String> used);
    void useProducts(ReceivedApplication receivedApplication);
}
