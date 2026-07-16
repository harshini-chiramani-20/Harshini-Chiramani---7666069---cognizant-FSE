package com.cognizant.loanservice.service;

import org.springframework.stereotype.Service;

import com.cognizant.loanservice.model.Loan;

@Service
public class LoanService {

    public Loan getLoanDetails() {

        return new Loan(
                2001,
                "Harshini",
                250000.00
        );
    }
}