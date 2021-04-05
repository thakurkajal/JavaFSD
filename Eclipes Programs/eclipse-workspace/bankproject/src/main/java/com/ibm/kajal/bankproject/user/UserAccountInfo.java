package com.ibm.kajal.bankproject.user;

@component("userAccountInfo")
public class UserAccountInfo implements userAccount{
	String userName;
	int accountNumber;
	int mobileNumber;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void displayInfo(String userName, int accountNumber, int mobileNumber) {
		
		System.out.println("Account holder name is: " + userName + " with account number: " + accountNumber + " and mobile number: " + mobileNumber);
	}
}