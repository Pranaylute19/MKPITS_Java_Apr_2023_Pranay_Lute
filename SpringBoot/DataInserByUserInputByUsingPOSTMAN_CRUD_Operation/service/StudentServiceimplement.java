package com.example.SpringBootApplication_Rest_Api.service;

import com.example.SpringBootApplication_Rest_Api.entity.Student;
import com.example.SpringBootApplication_Rest_Api.entity.StudentDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimplement implements StudentService {
    private StudentDao studentDao;
@Autowired
    public StudentServiceimplement(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    @Transactional
    public List<Student> findAll() {
        return studentDao.findAll1();
    }

    @Override
    @Transactional

//    public Student save(Student student) {
//        return studentDao.save(student);
//    }

    public String save(Student student) {
    return studentDao.save(student);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return studentDao.update(student);
    }

    @Override
    @Transactional
    public String delete(Integer rollnumber) {
        return studentDao.delete(rollnumber);
    }

}
