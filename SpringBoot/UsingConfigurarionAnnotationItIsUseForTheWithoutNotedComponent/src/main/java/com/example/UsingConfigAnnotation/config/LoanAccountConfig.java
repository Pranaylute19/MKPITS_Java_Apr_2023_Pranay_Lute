package com.example.UsingConfigAnnotation.config;

import com.example.UsingConfigAnnotation.Account;
import com.example.UsingConfigAnnotation.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanAccountConfig {
    @Bean
    public Account loanAccount(){
        return new LoanAccount();
    }

}