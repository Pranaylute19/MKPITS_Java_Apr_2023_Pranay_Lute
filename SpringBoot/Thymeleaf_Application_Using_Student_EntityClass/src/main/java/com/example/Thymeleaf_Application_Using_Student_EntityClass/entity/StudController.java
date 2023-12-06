package com.example.Thymeleaf_Application_Using_Student_EntityClass.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class StudController {
    @GetMapping("/form")
    public String proceddForm(Model model){

        Student student=new Student();
        model.addAttribute("stud",student);
        return "studForm";
    }
    @PostMapping("/process")
    public String data(@ModelAttribute ("stud") Student thestudent){
        return "showdata";
    }
}
