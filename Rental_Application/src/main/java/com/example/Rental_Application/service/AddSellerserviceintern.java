package com.example.Rental_Application.service;

import com.example.Rental_Application.entity.Seller;

public interface AddSellerserviceintern {
    Seller save(Seller seller);
    Seller findbyuiserid(String userid,String password);
}
