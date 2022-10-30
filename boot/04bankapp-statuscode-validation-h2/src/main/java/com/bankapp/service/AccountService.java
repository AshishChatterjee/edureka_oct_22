package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.AccountDetailsDto;
import com.bankapp.entities.Account;

public interface AccountService {
	public List<Account> getAll();
	public Account getById(int id);

	public void transfer(int fromAccId, int toAccId, double amount);
	public void deposit(int id, double amount);
	public void withdraw(int id, double amount);
	
	public Account addAccount(Account account);
	public void deleteAccount(int id);
	public Account updateAccountDetails(int id, AccountDetailsDto accountDetailsDto);
}
