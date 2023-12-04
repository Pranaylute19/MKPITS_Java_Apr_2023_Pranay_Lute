package com.example.SpringDataJPA_Application.service;

import com.example.SpringDataJPA_Application.entity.Student;
import com.example.SpringDataJPA_Application.entity.StudentDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    @Transactional
    public Student find(Integer rollnum) {
        Optional <Student>optional = studentDao.findById(rollnum);
         return optional.get();
    }
    @Override
    @Transactional
    public String saveRecordInTable(Student student) {
       studentDao.save(student);
       return "Data Inserted Successfully";
    }

    @Override
    @Transactional
    public String deleteRecord(Integer rollnum) {

    studentDao.deleteById(rollnum);
    return "deleted Succefully";
    }
}
