package com.ibm.kajal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.kajal.bean.Bank;
import com.ibm.kajal.dao.DAOClass;
import com.ibm.kajal.service.BankServiceInterface;

@Component("service")
public class BankServiceClass implements BankServiceInterface {

	@Autowired
	DAOClass dao;
	

	public void connectToDb() {
		dao.connectToDb();
	}

	@Override
	public boolean createAccount(Bank bank) {
		return dao.createAccount(bank);
	}

	@Override
	public boolean displayLowBalance(Bank bank) {
		return dao.displayLowBalance(bank);
	}

	@Override
	public boolean deposit(Bank bank) {
		return dao.deposit(bank);
	}

	@Override
	public boolean withdraw(Bank bank) {
		return dao.withdraw(bank);
	}

	@Override
	public boolean moneyTransfer(Bank bank) {
		return dao.moneyTransfer(bank);
	}

	@Override
	public Bank printTransaction(Bank bank) {
		return dao.printTransaction(bank);
	}

}

