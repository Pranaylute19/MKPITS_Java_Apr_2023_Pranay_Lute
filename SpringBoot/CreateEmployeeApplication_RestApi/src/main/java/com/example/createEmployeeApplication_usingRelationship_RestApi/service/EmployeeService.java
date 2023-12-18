package com.example.createEmployeeApplication_usingRelationship_RestApi.service;

import com.example.createEmployeeApplication_usingRelationship_RestApi.entity.Employee;

import java.util.List;

public interface EmployeeService {
     String save(Employee employee);
     List<Employee> show(Employee employee);
     Employee findbyid(int rollno);
     void deletebyid(int id);

     String updateData(Integer rollno,Employee newdata);
}
