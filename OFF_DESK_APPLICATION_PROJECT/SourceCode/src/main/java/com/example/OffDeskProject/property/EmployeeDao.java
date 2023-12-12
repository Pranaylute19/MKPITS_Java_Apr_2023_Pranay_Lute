package com.example.OffDeskProject.property;

import com.example.OffDeskProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
