package com.example.UsingMultipleAnnoatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Account account;
    @Autowired
    public void setAccount(@Qualifier("currentAccount") Account account) {
        // qualifier annotation us used to specify the bean implements
        this.account = account;
    }

//    @Autowired
//    public Controller(Account account) {
//        this.account=account;
//    }

    @GetMapping("/abc")
    public String display(){
        return account.display();
    }
}
