package com.example.Rental_Application.controller;

import com.example.Rental_Application.entity.Addproperty;
import com.example.Rental_Application.entity.Seller;
import com.example.Rental_Application.service.AddpropertyServiceinter;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@Controller
public class Propertycontroller {
    AddpropertyServiceinter addpropertyServiceinter;
    @Autowired

    public Propertycontroller(AddpropertyServiceinter addpropertyServiceinter) {
        this.addpropertyServiceinter = addpropertyServiceinter;
    }
    @GetMapping("/" )
    public String getproperties(Model model) {
       List<Addproperty> list= addpropertyServiceinter.getdata();
        model.addAttribute("list", list);
        return "showproperties";
    }
//@GetMapping("/users")
//public List<Addproperty> getAllUsers() {
//    return addpropertyServiceinter.getdata();
//}
    @GetMapping("/getform")// residential
    public String getform() {
        return "addpropertyform";
    }

//    @PostMapping("/addproperty")// residential
//    public String addproperty(@ModelAttribute Addproperty addproperty,HttpSession session){
//        addpropertyServiceinter.save(addproperty);
//        Seller seller = (Seller) session.getAttribute("user");
//        List<Addproperty> properties = addpropertyServiceinter.getPropertiesBySellerId(seller.getId());
//        session.setAttribute("totalListings", properties.size());
//        return "dashboard";
//
//    }
    @PostMapping("addproperty")
    public String addProperty(@ModelAttribute Addproperty addproperty, HttpSession session) {
        Seller seller = (Seller) session.getAttribute("user");
        if (seller != null) {
            addproperty.setSellerid(seller.getId());
            addpropertyServiceinter.save(addproperty);

            // Fetch updated properties for the logged-in seller
            List<Addproperty> properties = addpropertyServiceinter.getPropertiesBySellerId(seller.getId());
            session.setAttribute("properties", properties);
            return "dashboard";
        } else {
            return "login";
        }
    }

//    @PostMapping("/addproperty")// residential
//    public Addproperty addproperty(@RequestBody Addproperty addproperty){ // @modelattriute is used for get the data from html page and @Requestbody is used for the JSOn format
//      return addpropertyServiceinter.save(addproperty);
//
//    }
    @PostMapping("/dashboard")
    public String dashboard(@ModelAttribute Addproperty addproperty){
        addpropertyServiceinter.save(addproperty);
        return "dashboardupdate";
    }

}
