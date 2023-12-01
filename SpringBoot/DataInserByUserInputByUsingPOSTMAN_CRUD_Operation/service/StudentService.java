package com.example.SpringBootApplication_Rest_Api.service;

import com.example.SpringBootApplication_Rest_Api.entity.Student;

import java.util.List;

public interface StudentService {
   public List <Student> findAll();
   public String save(Student student);
//   public Student save(Student student);
   public Student update(Student student);
   public String delete(Integer rollnumber);
}
