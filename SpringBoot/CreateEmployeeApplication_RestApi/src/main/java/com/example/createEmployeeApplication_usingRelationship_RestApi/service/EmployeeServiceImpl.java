package com.example.createEmployeeApplication_usingRelationship_RestApi.service;

import com.example.createEmployeeApplication_usingRelationship_RestApi.entity.Employee;
import com.example.createEmployeeApplication_usingRelationship_RestApi.repo.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    @Transactional
    public String save(Employee employee) {
        employeeRepo.save(employee);
        return "inserted";
    }

    @Override
    public List<Employee> show(Employee employee) {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findbyid(int rollno) {
        return employeeRepo.findById(rollno).get();
    }

    @Override
    @Transactional
    public void deletebyid(int id) {
//        Optional optional=employeeRepo.findById(id);
//         Employee employee=(Employee) optional.get();
//         employeeRepo.delete(employee);

        employeeRepo.deleteById(id);

    }

    @Override
    @Transactional
    public String updateData(Integer rollno, Employee newdata) {
        Optional<Employee> optional = employeeRepo.findById(rollno);
        if (optional.isPresent()) {
            Employee employee = optional.get();
            employee.setEmployee_id(rollno);

            employeeRepo.save(employee);
        }
    return "Updated";
    }
}
