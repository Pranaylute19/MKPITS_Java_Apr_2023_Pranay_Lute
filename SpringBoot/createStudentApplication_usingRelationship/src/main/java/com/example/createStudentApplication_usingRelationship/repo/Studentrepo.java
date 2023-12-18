package com.example.createStudentApplication_usingRelationship.repo;

import com.example.createStudentApplication_usingRelationship.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student ,Integer> {
}
