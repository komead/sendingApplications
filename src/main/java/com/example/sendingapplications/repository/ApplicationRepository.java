package com.example.sendingapplications.repository;

import com.example.sendingapplications.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    List<Application> getAllByCompleted(boolean completed);
    Application findByNumber(String number);
}
