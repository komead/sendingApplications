package com.example.sendingapplications.controller;

import com.example.sendingapplications.entity.GoodsInfo;
import com.example.sendingapplications.service.GoodsInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/barcodes")
@AllArgsConstructor
public class ApplicationController {
    private GoodsInfoService goodsInfoService;

    @GetMapping("/exist/{data}")
    public boolean isExist(@PathVariable(value = "data") String barcode) {
        return goodsInfoService.barcodeIsExist(barcode);
    }

    @GetMapping("/all/{name}")
    public List<GoodsInfo> allByName(@PathVariable(value = "name") String name) {
        return goodsInfoService.getAllByName(name);
    }

    @GetMapping("/all")
    public List<GoodsInfo> all() {
        return goodsInfoService.getAll();
    }
}
