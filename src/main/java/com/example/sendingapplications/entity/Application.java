package com.example.sendingapplications.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "applications")
@Data
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @Column(nullable = false)
    private int number;

    @Column
    @JsonIgnore
    private String description;

    @OneToMany(mappedBy = "application")
    private List<ApplicationDetails> applicationDetails = new ArrayList<>();
}
