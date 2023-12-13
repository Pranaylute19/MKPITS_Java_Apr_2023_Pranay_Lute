package com.example.OffDeskProject.controller;

import com.example.OffDeskProject.entity.Employee;
import com.example.OffDeskProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;
@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/registration")

    public String registration(Model model){
        Employee employee=new Employee();
        model.addAttribute("emp",employee);
        employeeService.save(employee);
        return "registerform";
    }
}
