package com.example.SpringBootApplication_Rest_Api.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao {
    private EntityManager entityManager;
@Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll1() {
       TypedQuery<Student> typedQuery=entityManager.createQuery("from Student",Student.class);
       return typedQuery.getResultList();
    }

//    @Override
//    public Student save(Student student) {
//        Student student1=entityManager.merge(student);
//        return student1;
//    }

    @Override
    public String save(Student student) {
            entityManager.persist(student);
            return  "inserted";
        }


    @Override
    public Student update(Student student) {
    return  entityManager.merge(student);
    }

    @Override
    public String delete(Integer rollnumber) {
    Student student=entityManager.find(Student.class,rollnumber);
        entityManager.remove(student);
        return "deleted";

    }


}
