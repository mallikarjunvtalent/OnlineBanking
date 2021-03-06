package com.userFront.service;

import java.security.Principal;

import com.userFront.domain.PrimaryAccount;
import com.userFront.domain.SavingsAccount;

public interface AccountService {
	
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
	void deposit(String accountType, double parseDouble, Principal principal);
	void withdraw(String accountType, double parseDouble, Principal principal);
	
}
