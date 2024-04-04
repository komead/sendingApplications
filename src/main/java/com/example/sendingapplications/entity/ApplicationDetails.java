package com.example.sendingapplications.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "application_details")
@Data
public class ApplicationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @ManyToOne
    @JoinColumn(name = "application_id")
    @JsonIgnore
    private Application application;

    @OneToOne
    @JoinColumn(name = "goods_id")
    private GoodsInfo goodsInfo;

    @Column
    private int quantity;
}
