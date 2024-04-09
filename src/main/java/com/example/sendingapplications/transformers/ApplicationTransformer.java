package com.example.sendingapplications.transformers;

import com.example.sendingapplications.dto.ApplicationDto;
import com.example.sendingapplications.dto.ProductDto;
import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.entity.ApplicationDetails;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicationTransformer {
    public ApplicationDto toDto(Application application) {
        ApplicationDto applicationDto = new ApplicationDto();
        applicationDto.setId(application.getNumber());

        List<ApplicationDetails> applicationDetails = application.getApplicationDetails();
        List<ProductDto> productDtos = new ArrayList<>();

        for (ApplicationDetails current : applicationDetails) {
            ApplicationDetailsTransformer applicationDetailsTransformer = new ApplicationDetailsTransformer();
            productDtos.add(applicationDetailsTransformer.toDto(current));
        }
        applicationDto.setProducts(productDtos);

        return applicationDto;
    }
}