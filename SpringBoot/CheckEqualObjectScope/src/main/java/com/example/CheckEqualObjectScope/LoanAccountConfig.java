package com.example.CheckEqualObjectScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanAccountConfig {
    @Bean
    public Account loanAccount(){
        return new LoanAccount();
    }

}
