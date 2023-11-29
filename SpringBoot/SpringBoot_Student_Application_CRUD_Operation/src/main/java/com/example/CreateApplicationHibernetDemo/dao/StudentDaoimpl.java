package com.example.CreateApplicationHibernetDemo.dao;

import com.example.CreateApplicationHibernetDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
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
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
    @Override
    @Transactional
    public Student findrollno(Integer rollno) {

         return entityManager.find(Student.class,rollno);
    }

    @Override
    @Transactional
    public void deleterecord(Integer rollno) {
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("Record delete successfully");
    }

    public void updateRecord(Integer rollnum) {
        Student student=new Student();
        student.setStud_name("");

    }
}
