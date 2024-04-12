package com.example.sendingapplications.service;

import com.example.sendingapplications.entity.Product;

import java.util.List;

public interface ProductService {
    boolean barcodeIsExist(String gtin);
    List<Product> getAllByName(String name);
    List<Product> getAll();

}
