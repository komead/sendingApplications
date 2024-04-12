package com.example.sendingapplications.service.impl;

import com.example.sendingapplications.entity.ProductInfo;
import com.example.sendingapplications.repository.BoxRepository;
import com.example.sendingapplications.service.BoxService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BoxServiceImpl implements BoxService {
    private BoxRepository boxRepository;

    @Override
    public List<String> getContentByBarcode(String barcode) {
        List<String> content = new ArrayList<>();

        for (ProductInfo productInfo : boxRepository.findByBarcode(barcode).getProductInfo())
            if (!productInfo.isUsed())
                content.add(productInfo.getProduct().getGtin() + productInfo.getPackageNumber());

        return content;
    }
}