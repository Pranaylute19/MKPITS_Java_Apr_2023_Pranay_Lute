package com.example.SpringDataJPA_Application.service;

import com.example.SpringDataJPA_Application.entity.Student;

public interface StudentService {
      Student find(Integer rollnum);
      String saveRecordInTable(Student student);
      String deleteRecord(Integer rollnum);
}
