package com.example.SpringBootApplication_Rest_Api.entity;


import java.util.List;

public interface StudentDao {
     List<Student> findAll1();
      String save(Student student);
//      Student save (Student student);
      Student update(Student student);

      String delete(Integer rollnumber);

}
