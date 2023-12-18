package com.example.createEmployeeApplication_usingRelationship_RestApi.controller;


import com.example.createEmployeeApplication_usingRelationship_RestApi.entity.Employee;
import com.example.createEmployeeApplication_usingRelationship_RestApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public String insert(@RequestBody Employee employee){

        employeeService.save(employee);
        return "data inserted..!!";

    }
    @GetMapping("/employees")
    public List<Employee> show(Employee employee){
      List <Employee>lst=  employeeService.show(employee);
      return lst;
    }
    @GetMapping("/employee/{id}")
    public Employee findByid(@PathVariable int id){
        Employee employee=employeeService.findbyid(id);
        return employee;
    }
    @DeleteMapping("/employee/{id}")

    public void deletebyid(@PathVariable int id){
     employeeService.deletebyid(id);
    }
    @PutMapping("/")
    public String updateData(@PathVariable int id,@RequestParam Employee employee){
         String s=employeeService.updateData(id,employee);
            return employee.;
    }

}
