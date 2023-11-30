package com.example.DemoApplication.controller;

import com.example.DemoApplication.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class controller {
    @GetMapping("/std")
    public List<Student> getStudent(){
        List <Student>list=new ArrayList<>();
        list.add(new Student(100,"Pranay","dighori","nagpur"));
        list.add(new Student(101,"Abhi","dighori","nagpur"));
        return list;
    }
    @GetMapping("/std1/{studentId}")
    public Student getid(@PathVariable int studentId){
        List<Student>list=new ArrayList<>();
        list.add(new Student(111,"Shubham","Mahal","Nagpur"));
        list.add(new Student(112,"Teju","kharbi","Nagpur"));
        return list.get(studentId);
    }

}
