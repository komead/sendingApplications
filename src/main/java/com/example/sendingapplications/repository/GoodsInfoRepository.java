package com.example.sendingapplications.repository;

import com.example.sendingapplications.entity.GoodsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsInfoRepository extends JpaRepository<GoodsInfo, Integer> {
    boolean existsByBarcode(String barcode);
    List<GoodsInfo> findAllByName(String name);
}
