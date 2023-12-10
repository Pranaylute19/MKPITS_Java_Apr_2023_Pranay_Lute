package com.example.CRUD_SpringBootApplication.rest;

import com.example.CRUD_SpringBootApplication.entity.Student;
import com.example.CRUD_SpringBootApplication.entity.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StrudentController {
    private StudentDao studentDao;
@Autowired
    public StrudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @GetMapping("/form")
    public String showForm(Model model){
        Student student=new Student();
        model.addAttribute("stud" ,student);
        return "insert";
    }
    @PostMapping("/process")
    public String insertData(@ModelAttribute ("stud") Student student){
    studentDao.save(student);

    
    return "showData";
    }
}
