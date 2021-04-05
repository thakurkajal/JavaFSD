package com.ibm.kajal.bean;

import org.springframework.stereotype.Component;

@Component("bankBean")
public class Bank {
	private String number;
	private int bankID;
	private String name;
	private int balance;
	private String transactions;
	private int depositAmount;
	private int withdrawAmount;
	private String tonumber;

	public String getTonumber() {
		return tonumber;
	}

	public void setTonumber(String tonumber) {
		this.tonumber = tonumber;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public int getBankID() {
		return bankID;
	}

	@Override
	public String toString() {
		return "Phone Number=" + number +  "\n Name=" + name + "\n Balance="
				+ balance + "]";
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getTransactions() {
		return transactions;
	}

	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}

}
