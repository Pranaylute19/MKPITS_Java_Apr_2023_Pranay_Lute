package com.example.createEmployeeApplication_usingRelationship_RestApi.repo;

import com.example.createEmployeeApplication_usingRelationship_RestApi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
