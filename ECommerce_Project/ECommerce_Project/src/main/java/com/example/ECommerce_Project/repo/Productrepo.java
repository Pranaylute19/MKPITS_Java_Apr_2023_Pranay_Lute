package com.example.ECommerce_Project.repo;

import com.example.ECommerce_Project.entity.Product;
import com.example.ECommerce_Project.product_dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Productrepo extends JpaRepository<Product,Integer> {

    List<Product> findAllById(int id);
}
