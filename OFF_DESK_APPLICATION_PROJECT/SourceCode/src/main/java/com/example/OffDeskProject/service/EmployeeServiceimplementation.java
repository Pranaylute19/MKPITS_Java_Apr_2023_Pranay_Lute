package com.example.OffDeskProject.service;

import com.example.OffDeskProject.entity.Employee;
import com.example.OffDeskProject.property.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimplementation implements EmployeeService{

    private EmployeeDao employeedao;
    @Autowired

    public EmployeeServiceimplementation(EmployeeDao employeedao) {
        this.employeedao = employeedao;
    }



    @Override
    public String save(Employee employee) {

       return "null";
    }
}
