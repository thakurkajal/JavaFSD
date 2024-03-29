package com.ibm.kajal.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.kajal.bean.Bank;
import com.ibm.kajal.service.BankServiceClass;

@Component("bankClass")
public class BankUI {
	Scanner scan = new Scanner(System.in);

	@Autowired
	BankServiceClass service;

	@Autowired
	Bank bankBean;


	public void BankUI() {
		service.connectToDb();
		while (true) {
			System.out.println("Enter your Choice");
			System.out.println("1.Create account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Fund transfer");
			System.out.println("5. Print Transaction ");
			System.out.println("6.Exit ");

			int choice = scan.nextInt();
			scan.nextLine();
			choice(choice);
		}
	}


	void choice(int choice) {
		
		switch(choice) {
		case 1:create(); break;
		case 2: deposit(); break;
		case 3: withdraw(); break;
		case 4: fundTransfer(); break;
		case 5: printTransaction(); break;
		case 6: System.exit(0);
		}
	}
		
	private void printTransaction() {
		System.out.println("Enter Phone Number:");
		bankBean.setNumber(scan.nextLine());
		System.out.println("The Transcripts are:");
		System.out.println(service.printTransaction(bankBean).getTransactions());
	}

	private void fundTransfer() {
		System.out.println("Enter Phone Number:");
		bankBean.setNumber(scan.nextLine());
		
		if(service.displayLowBalance(bankBean))
			System.out.println("Low Balance...... Below 100");
		
		System.out.println("Enter the Phone Number of the reciever");
		bankBean.setTonumber(scan.nextLine());
		System.out.println("Enter Money to be transfered");
		bankBean.setWithdrawAmount(scan.nextInt());
		scan.nextLine();
		
		if(service.moneyTransfer(bankBean)) {
			System.out.println("Successful");
		}
		else
			System.out.println("Not Successful");
		
	}

	private void withdraw() {
		System.out.println("Enter Phone Number:");
		bankBean.setNumber(scan.nextLine());
		
		if(service.displayLowBalance(bankBean))
			System.out.println("Low Balance...... Below 100");
		
		System.out.println("enter Amount to be withdrawn");
		bankBean.setWithdrawAmount(scan.nextInt());
		scan.nextLine();
		if(service.withdraw(bankBean))
		{
			System.out.println("Amount withdrawn and details are:");
			System.out.println("New Balance" +bankBean.getBalance());
		}
		else
			System.out.println("Withdraw Failed");
		
		
	}

	void create() {
		System.out.println("Enter the Phone Number, Name");
		bankBean.setNumber(scan.nextLine());
		bankBean.setName(scan.nextLine());
		if(service.createAccount(bankBean))
		{
			System.out.println("Account Created and details are:");
			System.out.println(bankBean);
		}
		else
			System.out.println("The Account Couldnt be created due to some issues");
	}
	void deposit() {
		System.out.println("Enter Phone Number:");
		bankBean.setNumber(scan.nextLine());
		
		if(service.displayLowBalance(bankBean))
			System.out.println("Low Balance...... Below 100");
		
		System.out.println("enter Amount to be Deposited");
		bankBean.setDepositAmount(scan.nextInt());
		scan.nextLine();
		if(service.deposit(bankBean))
		{
			System.out.println("Amount Deposited and the new Balance is");
			System.out.println(bankBean.getBalance());
		}
		else
			System.out.println("Desposition Failed");
		
		
		
	}
	
}