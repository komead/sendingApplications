package com.example.sendingapplications.transformers;

import com.example.sendingapplications.dto.ProductForApplicationDto;
import com.example.sendingapplications.entity.ApplicationDetails;

public class ApplicationDetailsTransformer {
    public ProductForApplicationDto toProductForApplicationDto(ApplicationDetails applicationDetails) {
        ProductForApplicationDto productForApplicationDto = new ProductForApplicationDto();

        productForApplicationDto.setTitle(applicationDetails.getProduct().getName());
        productForApplicationDto.setGtin(applicationDetails.getProduct().getGtin());
        productForApplicationDto.setCount(applicationDetails.getQuantity());

        return productForApplicationDto;
    }
}