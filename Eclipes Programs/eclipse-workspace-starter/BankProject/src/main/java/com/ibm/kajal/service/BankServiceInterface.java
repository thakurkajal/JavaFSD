package com.ibm.kajal.service;

import com.ibm.kajal.bean.Bank;

public interface BankServiceInterface {
	
	public boolean createAccount(Bank bank);
	 public boolean displayLowBalance(Bank bank);
	 public boolean deposit(Bank bank);
	 public boolean withdraw(Bank bank);
	 public boolean moneyTransfer(Bank bank);
	 public Bank printTransaction(Bank bank);

}
