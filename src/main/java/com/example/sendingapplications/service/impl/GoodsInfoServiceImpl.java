package com.example.sendingapplications.service.impl;

import com.example.sendingapplications.entity.GoodsInfo;
import com.example.sendingapplications.repository.GoodsInfoRepository;
import com.example.sendingapplications.service.GoodsInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GoodsInfoServiceImpl implements GoodsInfoService {
    private GoodsInfoRepository goodsInfoRepository;

    @Override
    public boolean barcodeIsExist(String barcode) {
        return goodsInfoRepository.existsByBarcode(barcode);
    }

    @Override
    public List<GoodsInfo> getAllByName(String name) {
        return goodsInfoRepository.findAllByName(name);
    }

    @Override
    public List<GoodsInfo> getAll() {
        return goodsInfoRepository.findAll();
    }
}
