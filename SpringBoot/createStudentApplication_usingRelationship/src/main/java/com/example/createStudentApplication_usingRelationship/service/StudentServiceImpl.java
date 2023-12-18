package com.example.createStudentApplication_usingRelationship.service;

import com.example.createStudentApplication_usingRelationship.entity.Student;
import com.example.createStudentApplication_usingRelationship.repo.Studentrepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements Studentservice{

    private Studentrepo studentrepo;
    @Autowired
    public StudentServiceImpl(Studentrepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    @Override
    @Transactional
    public String save(Student student) {
    studentrepo.save(student);
        return "inserted";
    }
}
