package com.kajal.banking;

import java.math.BigDecimal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/** import com.ibm.kajal.bankproject.ClassPathXmlApplicationContext;
import com.ibm.kajal.bankproject.UserAccount;
import com.ibm.kajal.bankproject.userAccount;
import com.ibm.springdemo.EngineeringStudent;
import com.kajal.banking.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass; **/

import com.kajal.banking.exeptionoccured.InvalidInputOccured;
import com.kajal.banking.Wallet;
import com.kajal.banking.wallet.WalletService;
import com.kajal.banking.wallet.WalletServiceInfo;

public class App {
//static WalletServiceInfo wallet;
	
	
	public static void setUpBeforeClass() throws Exception 
	{
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
	        
	     Customer customer = context.getBean("customer", Customer.class);
	        
	     customer.toString();
	        
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdatabase","root","");
		//Statement st=con.createStatement();
		
		//st.executeUpdate("create table wallet_test(name varchar2(23),mobNo varchar(13),balance number)");
		//String customer1=String.format("insert into wallet121 values('%s','%s',%d)", "abhinav","9045459881",2456);
		//String customer2=String.format("insert into wallet121 values('%s','%s',%d)", "kajal","9934493433",456);
		//st.executeUpdate(customer1);
		//st.executeUpdate(customer2);
		//wallet=new WalletServiceInfo();
}

	/**	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		
	}
	
	

	@Before
	public void setUp() throws Exception 
	{
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","tiger");
		//Statement st=con.createStatement();
		//con.close();
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@org.junit.Test(expected=InvalidInputException.class)
	public void testCreateAccount()       //mobile number is less than 10 digit
	{
		BigDecimal ob=new BigDecimal(12333);
		wallet.createAccount("abhinav", "1233",ob);
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testCreateAccount2() 
	{
		BigDecimal ob=new BigDecimal(-12333);               //account opening balance cannot be negative
		wallet.createAccount("abhinav", "9935393423",ob);
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)// mobile number already registerd
	public void testCreateAccount3() 
	{
		BigDecimal ob=new BigDecimal(12333);
		wallet.createAccount("abhinav", "9935393433",ob);
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testCreateAccount4() 
	{
		BigDecimal ob=new BigDecimal(12333);
		wallet.createAccount("abhinav", "992222222335393423",ob);  //mobile number format is not correct
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testShowBalance() 
	{
		wallet.showBalance("235"); //mobile number format is not correct
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testShowBalance2() 
	{
		wallet.showBalance("2351111111111111111111"); //mobile number format is not correct
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testShowBalance3() 
	{
		wallet.showBalance("9987651234");// //mobile number format is not registered
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testFundTransfer1() {
		wallet.fundTransfer("111", "9045239881", new BigDecimal(12222));//Invalid souce mobile number
	}
	
	@org.junit.Test(expected=InvalidInputException.class)
	public void testFundTransfer2() {
		wallet.fundTransfer("9045239881", "909393",new BigDecimal(12222));//Invalid target mobile number
	}


	@org.junit.Test(expected=InvalidInputException.class)
	public void testFundTransfer3() {
		wallet.fundTransfer("9045239881", "9093931221",new BigDecimal(-12222));//amount cannot be negative
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testFundTransfer4() {
		wallet.fundTransfer("9045239882", "9093931221",new BigDecimal(22));// both mobile number not registered
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testFundTransfer5() {
		wallet.fundTransfer("9045239882", "9935393433",new BigDecimal(222));// source mobile number not registered
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testFundTransfer6() {
		wallet.fundTransfer("9045239881", "9093931221",new BigDecimal(222));// Target mobile number not registered
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testFundTransfer7() {
		wallet.fundTransfer("9045239881", "9045239881",new BigDecimal(222));// both mobile number cannot be same
	}
	@org.junit.Test(expected=InsufficientBalanceException.class)
	public void testFundTransfer8() {
		wallet.fundTransfer("9045239881", "9935393433",new BigDecimal(1111111112222.2222222));//insufficient Balance
	}
	@org.junit.Test(expected=ZeroBalanceException.class)
	public void testFundTransfer9() {
		wallet.fundTransfer("9045239881", "9935393433",new BigDecimal(0));//You cannot transfer zero balance
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testDepositAmount1() {
		wallet.depositAmount("112222", new BigDecimal(1222));
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testDepositAmount2() {
		wallet.depositAmount("112222", new BigDecimal(-1222));
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testDepositAmount3() {
		wallet.depositAmount("9912123456", new BigDecimal(122));
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testDepositAmount4() {
		wallet.depositAmount("191212345611", new BigDecimal(122));
	}
	@org.junit.Test(expected=ZeroBalanceException.class)
	public void testDepositAmount5() {
		wallet.depositAmount("9045239881", new BigDecimal(0));
	}

	@org.junit.Test(expected=InvalidInputException.class)
	public void testWithdrawAmount1() {
	wallet.withdrawAmount("1222", new BigDecimal(3333));
	}
	@org.junit.Test(expected=InvalidInputException.class)
	public void testWithdrawAmount2() {
	wallet.withdrawAmount("1222", new BigDecimal(-3333));
	}

	
	@org.junit.Test(expected=InvalidInputException.class)
	public void testWithdrawAmount3() {
	wallet.withdrawAmount("1222123222456", new BigDecimal(333));
	}
	@org.junit.Test(expected=MobileNumberNotRegistered.class)
	public void testWithdrawAmount4() {
	wallet.withdrawAmount("7744567890", new BigDecimal(133));
	}
	@org.junit.Test(expected=ZeroBalanceException.class)
	public void testWithdrawAmount5() {
	wallet.withdrawAmount("9045239881", new BigDecimal(0));
	}
**/
}