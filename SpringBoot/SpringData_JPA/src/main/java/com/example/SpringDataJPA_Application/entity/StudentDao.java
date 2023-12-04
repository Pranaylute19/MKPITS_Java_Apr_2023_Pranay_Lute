package com.example.SpringDataJPA_Application.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
