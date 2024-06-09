package com.example.Rental_Application.controller;

import com.example.Rental_Application.entity.Addproperty;
import com.example.Rental_Application.entity.Seller;
import com.example.Rental_Application.service.AddSellerserviceintern;
import com.example.Rental_Application.service.AddpropertyServiceinter;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("seller")
public class Sellercontroller {
   AddSellerserviceintern addSellerserviceintern;
   AddpropertyServiceinter addpropertyServiceinter;
    @Autowired
    public Sellercontroller(AddSellerserviceintern addSellerserviceintern,AddpropertyServiceinter addpropertyServiceinter) {
        this.addSellerserviceintern = addSellerserviceintern;
        this.addpropertyServiceinter=addpropertyServiceinter;
    }
    @RequestMapping("login")
    public String loginpage(){
        return "login";
    }
//    @PostMapping("logins")
//    public String login(@RequestParam String userid, @RequestParam String password, HttpSession httpSession, Model model){
//       Seller seller= addSellerserviceintern.findbyuiserid( userid, password);
////      Addproperty addproperty=addpropertyServiceinter.getAddpropertiesBySellerId(userid);
//       if (seller!=null){
//           httpSession.setAttribute("user",seller);
//
////           httpSession.setAttribute("users", addproperty );
//           return "dashboard";
//       }
//       else {
//       return "loginerror";
//       }
//    }
    @PostMapping("logins")
    public String login(@RequestParam String userid, @RequestParam String password, HttpSession httpSession, Model model) {
        Seller seller = addSellerserviceintern.findbyuiserid(userid, password);

        if (seller != null) {
            httpSession.setAttribute("user", seller);

            // Fetch properties for the logged-in seller
            List<Addproperty> properties = addpropertyServiceinter.getPropertiesBySellerId(seller.getId());
            httpSession.setAttribute("properties", properties);

            return "dashboard";
        } else {
            return "loginerror";
        }
    }
    @GetMapping("createseller")
    public String addseller(){
        return "sellerAdd";
    }
    @PostMapping("addsellerinfo")
    public String addseller(@ModelAttribute Seller seller){
       addSellerserviceintern.save(seller);
       return "dashboard";
    }
}
