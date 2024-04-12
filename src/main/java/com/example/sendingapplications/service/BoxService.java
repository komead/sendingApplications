package com.example.sendingapplications.service;

import java.util.List;

public interface BoxService {
    List<String> getContentByBarcode(String barcode);
}
