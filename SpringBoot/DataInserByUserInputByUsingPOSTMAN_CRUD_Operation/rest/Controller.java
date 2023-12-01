package com.example.SpringBootApplication_Rest_Api.rest;


import com.example.SpringBootApplication_Rest_Api.entity.Student;
import com.example.SpringBootApplication_Rest_Api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class Controller {
   private StudentService service;
  @Autowired
    public Controller(StudentService service) {
        this.service = service;
    }

    @GetMapping("/list1")
    public List<Student> getMesg(){
      return  service.findAll();
    }
    @PostMapping("/student")
    public String insert(@RequestBody Student student){

      return  service.save(student);
    }
//    public void insert(@RequestBody Student student){
////    return service.save(student);
//
//      System.out.println(service.save(student)+"inserted");
//
//    }


    @PutMapping("/studentupdate")
  public Student updateStudent(@RequestBody Student student){
    return service.update(student);
    }
    @DeleteMapping("/student/{rollnumber}")
  public String deleteAccount(@PathVariable int rollnumber){
 service.delete(rollnumber);
      return "data delete successfully";

    }

}
