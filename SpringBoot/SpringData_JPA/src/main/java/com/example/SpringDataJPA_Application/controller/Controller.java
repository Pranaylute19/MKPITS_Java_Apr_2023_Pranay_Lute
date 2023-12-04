package com.example.SpringDataJPA_Application.controller;

import com.example.SpringDataJPA_Application.entity.Student;
import com.example.SpringDataJPA_Application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class Controller {

    private  StudentService service;
@Autowired
    public Controller(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students/{rollnum}")
    public Student find(@PathVariable Integer rollnum){
         return service.find(rollnum);
    }
    @PostMapping("/students")
    public String saveData(@RequestBody Student student){
    return service.saveRecordInTable(student);
    }
    @DeleteMapping("/students/{rollnumber}")
    public String delete(@PathVariable @RequestBody Integer rollnumber){
    return  service.deleteRecord(rollnumber);

    }
}
