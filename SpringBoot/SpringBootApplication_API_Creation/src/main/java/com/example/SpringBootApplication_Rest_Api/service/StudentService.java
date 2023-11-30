package com.example.SpringBootApplication_Rest_Api.service;

import com.example.SpringBootApplication_Rest_Api.entity.Student;
import com.example.SpringBootApplication_Rest_Api.entity.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements StudentServiceImpl{
    private StudentDao studentDao;
@Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
