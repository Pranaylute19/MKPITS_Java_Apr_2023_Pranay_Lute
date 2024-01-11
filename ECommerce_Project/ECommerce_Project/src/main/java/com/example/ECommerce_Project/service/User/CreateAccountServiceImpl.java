package com.example.ECommerce_Project.service.User;

import com.example.ECommerce_Project.entity.CreateAccount;
import com.example.ECommerce_Project.repo.CreateAccountrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateAccountServiceImpl implements CreateAccountservice {

    private CreateAccountrepo createAccountrepo;
    @Autowired
    public CreateAccountServiceImpl(CreateAccountrepo createAccountrepo) {
        this.createAccountrepo = createAccountrepo;
    }

    @Override
    public void create(CreateAccount createAccount) {
        createAccountrepo.save(createAccount);
    }

    @Override
    public Optional<CreateAccount> logincheck(int id) {
        return  createAccountrepo.findById(id);
    }
}
