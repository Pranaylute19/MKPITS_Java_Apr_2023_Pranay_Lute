package com.example.DataRest_Thymeleaf.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller

public class ControllerRest {
    @RequestMapping("/hello")
    public String sayhello(){
        return "hello";
    }
    @RequestMapping("/table")
    public String Showtable(){
        return "table";
    }
    @RequestMapping("/processform")
    public String processdata(HttpServletRequest request, Model model){
     String Fname= request.getParameter("First");
     String Sname=request.getParameter("Last");
     String email=request.getParameter("email");
     String Pno=request.getParameter("pno");

        model.addAttribute("Firstname",Fname);
        model.addAttribute("lastname",Sname);
        model.addAttribute("Email",email);
        model.addAttribute("PhoneNumber",Pno);
        return "Display_Data";

    }
}
