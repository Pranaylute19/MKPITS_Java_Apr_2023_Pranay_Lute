package com.example.ECommerce_Project.repo;

import com.example.ECommerce_Project.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoryrepo extends JpaRepository<Category,Integer> {
}
