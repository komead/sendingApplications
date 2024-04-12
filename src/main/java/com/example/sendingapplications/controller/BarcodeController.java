package com.example.sendingapplications.controller;

import com.example.sendingapplications.entity.Product;
import com.example.sendingapplications.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/barcodes")
@AllArgsConstructor
public class BarcodeController {
    private ProductService productService;

    @GetMapping("/exist/{data}")
    public boolean isExist(@PathVariable(value = "data") String barcode) {
        return productService.barcodeIsExist(barcode);
    }

    @GetMapping("/all/{name}")
    public List<Product> allByName(@PathVariable(value = "name") String name) {
        return productService.getAllByName(name);
    }

    @GetMapping("/all")
    public List<Product> all() {
        return productService.getAll();
    }
}
