package com.example.ECommerce_Project.controller;


import com.example.ECommerce_Project.entity.CreateAccount;
import com.example.ECommerce_Project.service.User.CreateAccountservice;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateAccountController {
    private CreateAccountservice createAccountservice;
        @Autowired
    public CreateAccountController(CreateAccountservice createAccountservice) {
        this.createAccountservice = createAccountservice;
    }
    @GetMapping("/create")
    public String createaccount(Model model){
        CreateAccount createAccount=new CreateAccount();
        model.addAttribute("create",createAccount);
            return "UserRegistration";
    }
    @Transactional
    @PostMapping("/postdetail")
    public  String postdatadetail(@ModelAttribute ("CreateAccount") CreateAccount createAccount){
            createAccountservice.create(createAccount);
            return "AccountCreatedSuccefully";
    }
    @GetMapping("/login")
    public String login(Model model){
            CreateAccount createAccount=new CreateAccount();
            model.addAttribute("login",createAccount);
            return "Login";
    }
//    @GetMapping("/login/{id}")
//    public String logincheck(@ModelAttribute ("model") CreateAccount createAccount,
//                             @PathVariable int id ){
//            Optional <CreateAccount> optional=createAccountservice.logincheck(id);
//            if (optional.isPresent()){
//                String pass=createAccount.getPassword();
////                if (){
//
//
//            }


}
