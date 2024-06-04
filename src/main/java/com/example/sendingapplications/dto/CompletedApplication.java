package com.example.sendingapplications.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompletedApplication {
    private String proposal_id;
    private List<String> gtins;
}
