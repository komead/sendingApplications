package com.example.sendingapplications.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "goods_info")
@Data
public class GoodsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String barcode;
}
