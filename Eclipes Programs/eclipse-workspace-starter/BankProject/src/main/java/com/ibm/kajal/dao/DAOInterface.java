package com.ibm.kajal.dao;

import com.ibm.kajal.bean.Bank;

public interface DAOInterface {
	public boolean createAccount(Bank bank);

	public boolean displayLowBalance(Bank bank);

	public boolean deposit(Bank bank);

	public boolean withdraw(Bank bank);

	public boolean moneyTransfer(Bank bank);

	public Bank printTransaction(Bank bank);
}
