package com.example.ECommerce_Project.service.admin;

import com.example.ECommerce_Project.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    void addcategory(Category category);
    List<Category> showcategory();

    Optional<Category> getCategoryById(int id);

    void deleteCategory(int id);
    Optional<Category> updatecategory(int id);
}
