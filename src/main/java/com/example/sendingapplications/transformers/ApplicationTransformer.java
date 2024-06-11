package com.example.sendingapplications.transformers;

import com.example.sendingapplications.dto.ApplicationDto;
import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.entity.ApplicationDetails;

public class ApplicationTransformer {
    public ApplicationDto toDto(Application application) {
        ApplicationDto applicationDto = new ApplicationDto();
        applicationDto.setId(application.getNumber());

        ApplicationDetailsTransformer applicationDetailsTransformer = new ApplicationDetailsTransformer();

        for (ApplicationDetails current : application.getApplicationDetails())
            applicationDto.addProduct(applicationDetailsTransformer.toProductForApplicationDto(current));

        return applicationDto;
    }
}