package com.example.sendingapplications.repository;

import com.example.sendingapplications.entity.ApplicationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDetailsRepository extends JpaRepository<ApplicationDetails, Integer> {
}
