package com.example.sendingapplications.repository;

import com.example.sendingapplications.entity.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box, Integer> {
    Box findByBarcode(String barcode);
}