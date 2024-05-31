package com.example.Rental_Application.controller;

import com.example.Rental_Application.entity.Addproperty;
import com.example.Rental_Application.service.AddpropertyServiceinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class Customercontroller {

    private AddpropertyServiceinter addpropertyServiceinter;
    @Autowired
    public Customercontroller(AddpropertyServiceinter addpropertyServiceinter) {
        this.addpropertyServiceinter = addpropertyServiceinter;
    }
//    @GetMapping("propertydetails/{propertyid}")
//    public String propertydetail(@PathVariable("propertyid") int id, Model model){
//        Optional<Addproperty> addproperty=addpropertyServiceinter.findbyid(id);
//        model.addAttribute("records",addproperty);
//        return "propertydetails";
//    }

    @GetMapping("/propertydetails/{propertyId}")
    public String viewPropertyDetails(@PathVariable("propertyId") int propertyId, Model model) {
        Optional<Addproperty> propertyOpt = addpropertyServiceinter.findbyid(propertyId);
        if (propertyOpt.isPresent()) {
            model.addAttribute("records", propertyOpt.get());
            return "propertydetails";
        } else {
            return "propertyNotFound"; // Create this view to handle the case where the property is not found
        }
    }

}
