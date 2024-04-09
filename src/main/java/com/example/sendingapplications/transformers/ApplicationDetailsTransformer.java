package com.example.sendingapplications.transformers;

import com.example.sendingapplications.dto.ProductDto;
import com.example.sendingapplications.entity.ApplicationDetails;
import lombok.Data;

@Data
public class ApplicationDetailsTransformer {
    public ProductDto toDto(ApplicationDetails applicationDetails) {
        ProductDto productDto = new ProductDto();

        productDto.setTitle(applicationDetails.getGoodsInfo().getName());
        productDto.setGtin(applicationDetails.getGoodsInfo().getBarcode());
        productDto.setCount(applicationDetails.getQuantity());

        return productDto;
    }
}