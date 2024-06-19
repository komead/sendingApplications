package com.example.sendingapplications.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class ReceivedApplication {
    private String number;
    private List<Info> gtins;

    @Data
    private static class Info {
        private String gtin;
        private String package_number;
    }

    public Map<String, String> returnMap() {
        Map<String, String> map = new HashMap<>();

        for (Info info : gtins) {
            map.put(info.gtin, info.package_number);
        }

        return map;
    }
}
