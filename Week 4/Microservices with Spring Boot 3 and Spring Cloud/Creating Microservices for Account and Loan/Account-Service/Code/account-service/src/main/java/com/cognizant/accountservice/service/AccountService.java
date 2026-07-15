package com.cognizant.accountservice.service;

import org.springframework.stereotype.Service;

import com.cognizant.accountservice.model.Account;

@Service
public class AccountService {

    public Account getAccountDetails() {

        return new Account(
                1001,
                "Harshini",
                50000.00
        );
    }
}