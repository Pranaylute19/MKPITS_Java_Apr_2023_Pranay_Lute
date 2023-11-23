package com.example.UsingMultipleAnnoatation;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary   // @primary used for the primary Component
public class SavingClass implements Account {
    public String display(){
        return "this is SavingAccount";
    }
}
