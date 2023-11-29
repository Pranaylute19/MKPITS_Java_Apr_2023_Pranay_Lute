package com.example.CreateApplicationHibernetDemo.dao;

import com.example.CreateApplicationHibernetDemo.entity.Student;

public interface StudentDao {
    public void save(Student student);
    public Student findrollno(Integer rollno);
    public void deleterecord(Integer rollno);
    public void updateRecord(Integer rollno);
}
