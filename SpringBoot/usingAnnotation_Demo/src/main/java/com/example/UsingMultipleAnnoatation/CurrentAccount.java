package com.example.UsingMultipleAnnoatation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CurrentAccount implements Account {

    public String display(){
        return "this is current account";
    }

}
