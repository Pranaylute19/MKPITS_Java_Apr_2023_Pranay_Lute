package com.example.CreateApplicationHibernetDemo.dao;

import com.example.CreateApplicationHibernetDemo.entity.Student;

public interface StudentDao {
    public void save(Student student);
    Student findrollno(Integer rollno);
}
