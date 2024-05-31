package com.example.Rental_Application.service;

import com.example.Rental_Application.entity.Seller;
import com.example.Rental_Application.repo.AddSellerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddSellerserviceclass implements AddSellerserviceintern {

   private AddSellerrepo addSellerrepo;
    @Autowired
    public AddSellerserviceclass(AddSellerrepo addSeller) {
        this.addSellerrepo = addSeller;
    }

    @Override
    public Seller save(Seller seller) {
        return addSellerrepo.save(seller);
    }

    @Override
    public Seller findbyuiserid(String userid, String password) {
      return addSellerrepo.findbyuiserid(userid,password);
    }
}
