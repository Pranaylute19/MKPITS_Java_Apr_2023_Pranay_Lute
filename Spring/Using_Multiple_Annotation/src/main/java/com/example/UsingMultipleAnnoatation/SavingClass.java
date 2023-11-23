package com.example.UsingMultipleAnnoatation;


import org.springframework.stereotype.Component;
@Component
public class SavingClass implements Account {
    public String display(){
        return "this is SavingAccount";
    }
}
