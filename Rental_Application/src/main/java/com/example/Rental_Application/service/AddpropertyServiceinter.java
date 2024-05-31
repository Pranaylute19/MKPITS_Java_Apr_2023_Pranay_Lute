package com.example.Rental_Application.service;

import com.example.Rental_Application.entity.Addproperty;

import java.util.List;
import java.util.Optional;

public interface AddpropertyServiceinter {
     List<Addproperty> getdata();
     Addproperty save(Addproperty addproperty);

//      List<Addproperty> getAddpropertiesBySellerId(String sellerId) ;
List<Addproperty> getPropertiesBySellerId(int sellerId);
Optional<Addproperty> findbyid(int id);
}
