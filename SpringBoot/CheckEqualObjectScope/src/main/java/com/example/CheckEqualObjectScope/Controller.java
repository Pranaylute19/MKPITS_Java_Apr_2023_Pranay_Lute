package com.example.CheckEqualObjectScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Account account1;
//    private Account account2;
@Autowired
    public Controller(@Qualifier("saving") Account account1) {
        this.account1 = account1;
//        this.account2 = account2;
    }
//    @GetMapping("/")
//    public boolean display(){
//        return account1==account2;
//    }
//    @GetMapping("/abc")
//    public boolean display1(){
//    return account1==account2;
//    }


}
