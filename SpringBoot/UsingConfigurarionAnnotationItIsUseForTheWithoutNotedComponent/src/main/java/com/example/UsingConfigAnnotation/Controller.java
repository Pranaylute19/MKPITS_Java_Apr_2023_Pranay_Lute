package com.example.UsingConfigAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Account account1;

    @Autowired
    public Controller(@Qualifier("loanAccount") Account account1) {
        this.account1 = account1;
    }
    @GetMapping("/")
    public String display(){
        return account1.display();
    }
}