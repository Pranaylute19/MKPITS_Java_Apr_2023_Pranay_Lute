package com.example.CreateApplicationHibernetDemo.dao;

import com.example.CreateApplicationHibernetDemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class StudentDaoimpl implements StudentDao{
    private EntityManager entityManager;
    @Autowired
    public StudentDaoimpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
    @Override
    public Student findrollno(Integer rollno) {
        return entityManager.find(Student.class,rollno);
    }
}
