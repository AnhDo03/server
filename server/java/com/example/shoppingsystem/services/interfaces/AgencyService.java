package com.example.shoppingsystem.services.interfaces;

import com.example.shoppingsystem.dtos.ProductInfoDTO;
import com.example.shoppingsystem.entities.Account;

public interface AgencyService {
    ProductInfoDTO createProduct(Account agency, ProductRequest request);
}
