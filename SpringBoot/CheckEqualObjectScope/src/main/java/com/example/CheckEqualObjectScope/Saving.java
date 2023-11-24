package com.example.CheckEqualObjectScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Saving implements Account{
    public String display(){
        return "Saving";
    }
    @PostConstruct
    public void show1(){
        System.out.println("Welcome");
    }
   @PreDestroy
    public void show(){
        System.out.println("End");
    }

}
