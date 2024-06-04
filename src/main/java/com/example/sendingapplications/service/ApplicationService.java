package com.example.sendingapplications.service;

import com.example.sendingapplications.entity.Application;

import java.util.List;

public interface ApplicationService {
    void add(Application application);
    List<Application> getAll();
    List<Application> getAllByCompleted(boolean completed);
    void changeStatus(String number);
}
