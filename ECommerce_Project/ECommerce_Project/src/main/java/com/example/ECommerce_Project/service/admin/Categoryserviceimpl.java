package com.example.ECommerce_Project.service.admin;

import com.example.ECommerce_Project.entity.Category;
import com.example.ECommerce_Project.repo.Categoryrepo;
import com.example.ECommerce_Project.service.admin.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Categoryserviceimpl implements CategoryService {
  private Categoryrepo categoryrepo;
@Autowired
    public Categoryserviceimpl(Categoryrepo categoryrepo) {
        this.categoryrepo = categoryrepo;
    }
    @Override

    public void addcategory(Category category) {
        categoryrepo.save(category);
    }
    @Override
    public List<Category> showcategory() {
        return categoryrepo.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(int id) {
        return categoryrepo.findById(id);
    }

    @Override
    public void deleteCategory(int id) {
        categoryrepo.deleteById(id);
    }

    @Override
    public Optional<Category> updatecategory(int id) {
     return  categoryrepo.findById(id);

    }
}
