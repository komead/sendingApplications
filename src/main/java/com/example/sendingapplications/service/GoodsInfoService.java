package com.example.sendingapplications.service;

import com.example.sendingapplications.entity.GoodsInfo;

import java.util.List;

public interface GoodsInfoService {
    boolean barcodeIsExist(String barcode);
    List<GoodsInfo> getAllByName(String name);
    List<GoodsInfo> getAll();

}
