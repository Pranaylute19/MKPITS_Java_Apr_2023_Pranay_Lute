package com.example.ECommerce_Project.service.User;

import com.example.ECommerce_Project.entity.CreateAccount;

import java.util.Optional;

public interface CreateAccountservice {
    void create(CreateAccount createAccount);

    Optional<CreateAccount> logincheck(int id);
}
