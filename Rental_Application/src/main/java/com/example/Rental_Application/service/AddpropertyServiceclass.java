package com.example.Rental_Application.service;

import com.example.Rental_Application.entity.Addproperty;
import com.example.Rental_Application.repo.Addpropertyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AddpropertyServiceclass implements AddpropertyServiceinter{

  private  Addpropertyrepo addpropertyrepo;
    @Autowired
    public AddpropertyServiceclass(Addpropertyrepo addpropertyrepo) {
        this.addpropertyrepo = addpropertyrepo;
    }
    @Override
    public List<Addproperty> getdata() {
    return addpropertyrepo.findAll();
    }

  @Override
  public Addproperty save(Addproperty addproperty) {
   return addpropertyrepo.save(addproperty);
//    return addproperty;
  }
  public List<Addproperty> getPropertiesBySellerId(int sellerId) {
    return addpropertyrepo.findBySellerid(sellerId);
  }

  @Override
  public Optional<Addproperty> findbyid(int id) {
   return addpropertyrepo.findById(id);
  }

//  @Override
//  public List<Addproperty> getAddpropertiesBySellerId(String sellerId) {
//    return addpropertyrepo.findpropertybyid(sellerId);
//  }

}
