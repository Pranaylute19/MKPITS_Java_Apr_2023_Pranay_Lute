package com.example.ECommerce_Project.service.admin;

import com.example.ECommerce_Project.entity.Product;
import com.example.ECommerce_Project.repo.Productrepo;
import com.example.ECommerce_Project.service.admin.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private Productrepo productrepo;
    @Autowired
    public ProductServiceImpl(Productrepo productrepo) {
        this.productrepo = productrepo;
    }

    @Override
    public List<Product> getAllProduct() {
      return productrepo.findAll();
    }

    @Override
    public void addproduct(Product product) {
            productrepo.save(product);
    }

    @Override
    public void deletebyid(int id) {
        productrepo.deleteById(id);
    }

    @Override
    public Product updateproduct(Integer id) {

     Optional <Product> optional=productrepo.findById(id);
     return optional.get();
    }
        @Override
    public List<Product> getallproductcategorybyId(int id) {
        return productrepo.findAllById(id);
    }

}
