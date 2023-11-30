package com.example.SpringBootApplication_Rest_Api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

public interface StudentDao {
     List<Student> findAll();

}
