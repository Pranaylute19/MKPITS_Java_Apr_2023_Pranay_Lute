package com.example.SpringBootApplication_Rest_Api.service;

import com.example.SpringBootApplication_Rest_Api.entity.Student;

import java.util.List;

public interface StudentServiceImpl {
    List <Student> findAll();
}
