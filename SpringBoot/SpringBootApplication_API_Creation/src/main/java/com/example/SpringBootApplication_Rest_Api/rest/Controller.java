package com.example.SpringBootApplication_Rest_Api.rest;


import com.example.SpringBootApplication_Rest_Api.entity.Student;
import com.example.SpringBootApplication_Rest_Api.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/list")
public class Controller {
   private StudentServiceImpl service;
  @Autowired
    public Controller(StudentServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/list1")
    public List<Student> getMesg(){
      List<Student>student=new ArrayList<>();

      return  service.findAll();
    }
}
