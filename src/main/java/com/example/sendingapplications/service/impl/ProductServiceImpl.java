package com.example.sendingapplications.service.impl;

import com.example.sendingapplications.dto.ReceivedApplication;
import com.example.sendingapplications.entity.ProductInfo;
import com.example.sendingapplications.repository.ProductInfoRepository;
import com.example.sendingapplications.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductInfoRepository productInfoRepository;

    @Override
    public void setUsed(List<String> used) {
        for (String data : used) {
            List<ProductInfo> infoList = productInfoRepository.findByPackageNumber(data.substring(data.length() - 3));
            for (ProductInfo productInfo : infoList) {
                if (data.contains(productInfo.getProduct().getGtin())) {
                    productInfo.setUsed(true);
                    productInfoRepository.save(productInfo);
                }
            }
        }
    }

    @Override
    public void useProducts(ReceivedApplication receivedApplication) {
        for (Map.Entry<String, String> entry : receivedApplication.returnMap().entrySet()) {
            List<ProductInfo> infoList = productInfoRepository.findByPackageNumber(entry.getValue());
            for (ProductInfo productInfo : infoList) {
                if (entry.getKey().equals(productInfo.getProduct().getGtin())) {
                    productInfo.setUsed(true);
                    productInfoRepository.save(productInfo);
                }
            }
        }
    }
}
