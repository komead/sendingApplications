package com.example.sendingapplications.repository;

import com.example.sendingapplications.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByBarcode(String barcode);
    List<Product> findAllByName(String name);
}
