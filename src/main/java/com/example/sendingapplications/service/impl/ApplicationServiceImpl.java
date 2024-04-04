package com.example.sendingapplications.service.impl;

import com.example.sendingapplications.entity.Application;
import com.example.sendingapplications.repository.ApplicationRepository;
import com.example.sendingapplications.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    private ApplicationRepository applicationRepository;

    @Override
    public void add(Application application) {
        applicationRepository.save(application);
    }

    @Override
    public List<Application> getAll() {
        return applicationRepository.findAll();
    }
}