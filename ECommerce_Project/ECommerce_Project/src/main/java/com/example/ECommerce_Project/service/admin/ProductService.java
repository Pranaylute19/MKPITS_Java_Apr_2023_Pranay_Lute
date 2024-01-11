package com.example.ECommerce_Project.service.admin;

import com.example.ECommerce_Project.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();
     void addproduct(Product product);

     void deletebyid(int id);
      Product updateproduct(Integer id);

      public List<Product> getallproductcategorybyId(int id);
}
