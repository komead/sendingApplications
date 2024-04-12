package com.example.sendingapplications.service.impl;

import com.example.sendingapplications.entity.Product;
import com.example.sendingapplications.repository.ProductRepository;
import com.example.sendingapplications.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public boolean barcodeIsExist(String gtin) {
        return productRepository.existsByGtin(gtin);
    }

    @Override
    public List<Product> getAllByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
