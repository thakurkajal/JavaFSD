package com.ibm.kajal.jdbc_starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App{
	Connection con;
	String queryToExecute;
	PreparedStatement thePreparedStatement;
	Statement theStatement;
	ResultSet theResultSet;
	
	
	App(){
		String userPassword="";
		String urlToConnect="jdbc:mysql://localhost:3306/ibmfeb21";
		String userName="root";
		
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Not loaded the Driver..." + e.getMessage());
		}       
    	
    	 
        try {        	
			//Connecting to database
        	con = DriverManager.getConnection(urlToConnect, userName, userPassword);
			System.out.println("Connected to Employee database...");
		} catch (SQLException e) {
			System.out.println("Not Connected to Employee database..." + e.getMessage());
		}
        
	}
	
	void getAllEmployeeDetails() {
		queryToExecute = "select * from employee";
		try {
			theStatement = con.createStatement();
			
			theResultSet = theStatement.executeQuery(queryToExecute);
			
			//traversing
			while(theResultSet.next()) {
				System.out.println("The employee ID is: " + theResultSet.getInt("empId") + " and name of an employee is: " 
						+ theResultSet.getString("empName") + " with address " + theResultSet.getString("empAddress"));
			}
		} catch (SQLException e) {
			System.out.println("Some issues while executing the query..." + e.getMessage());
		}
		
		
	}
	
	void getCountOfAllEmployees() {
		int countOfRecords = 0;
		
		queryToExecute = "select * from employee";
		try {
			theStatement = con.createStatement();
			
			theResultSet = theStatement.executeQuery(queryToExecute);
			
			while(theResultSet.next())
				countOfRecords++;
			System.out.println("Number of total employees are: " + countOfRecords);
		} catch (SQLException e) {
			System.out.println("problem while executing the query..." + e.getMessage());
		}
	}
	
/**		void getEmployeeDetailsById() {
		queryToExecute = "select * from employee where empId=1";
		try {
			theStatement = con.createStatement();
			
			theResultSet = theStatement.executeQuery(queryToExecute);
			
			while(theResultSet.next())
				System.out.println("The employee ID is: " + theResultSet.getInt("empId") + " and name of an employee is: " 
						+ theResultSet.getString("empName") + " with address " + theResultSet.getString("empAddress"));
		} catch (SQLException e) {
			System.out.println("problem while executing the query..." + e.getMessage());
		}
	} **/ 
	
	void getEmployeeDetailsById(int empId) {
		queryToExecute = "select * from employee where empId=?";
		try {
			thePreparedStatement = con.prepareStatement(queryToExecute);
			
			//Replace the ? to value
			thePreparedStatement.setInt(1, empId);;
		
			theResultSet = thePreparedStatement.executeQuery();
			while(theResultSet.next()) {
				System.out.println("The employee id whose details want to fetch is: " + 
						theResultSet.getInt("empId") + " with name: " + 
						theResultSet.getString("empName") + " and address: " + 
						theResultSet.getString("empAddress"));
			}
		} catch (SQLException e) {
			System.out.println("problem while executing the query..." + e.getMessage());
		}
	} 
	
	void addNewEmployeedetails(String empName, String empAddress) {
		queryToExecute = "insert into employee(empName, empAddress) values(?,?)";
		
		try {
			thePreparedStatement = con.prepareStatement(queryToExecute);
			
			//Replace the ? to value
			thePreparedStatement.setString(1, empName);
			thePreparedStatement.setString(2, empAddress);
			
			//Execute the query
			if(thePreparedStatement.executeUpdate()>0)
				System.out.println("New Employee Details Added Successfully...");
			else
				System.out.println("Insertion operation is Unsuccessfull...");
		} catch (SQLException e) {
			System.out.println("problem while executing the theStatement..." + e.getMessage());
		}
	}
	
	
	void updateEmployeeDetails(String name, String empAddress, int empId) {
			queryToExecute = "update employee set empName=?, empAddress=? where empId=?";
			
			try {
				thePreparedStatement = con.prepareStatement(queryToExecute);
				
				//Replace the ? to value
				thePreparedStatement.setString(1, name);
				thePreparedStatement.setString(2, empAddress);
				thePreparedStatement.setInt(3, empId);;
				//Execute the query
				if(thePreparedStatement.executeUpdate()>0)
					System.out.println("New Employee Details Added Successfully...");
				else
					System.out.println("Insertion operation is Unsuccessfull...");
			} catch (SQLException e) {
				System.out.println("problem while executing the theStatement..." + e.getMessage());
			}
	}
	
	
	void deleteEmployeeDetails(int empId) {
		queryToExecute = "delete from employee where empId=?";
		
		try {
			thePreparedStatement = con.prepareStatement(queryToExecute);
			
			//Replace the ? to value
			thePreparedStatement.setInt(1, empId);;
			
			if(thePreparedStatement.executeUpdate()>0)
				System.out.println("Employee Details Deleted Successfully...");
			else
				System.out.println("Deletion Operation is Unsuccessfull...");
		} catch (SQLException e) {
			System.out.println("problem while executing the theStatement..." + e.getMessage());
		}
	}
	
    public static void main( String[] args ){
    	App app = new App();
    	System.out.println("Enter the operation you want to perform: ");
    	System.out.println("1. Get All Employee Details 2.Get Count Of All employees "
    			+ "3.Get Employee Details By ID  4.Add Employee Details  5."
    			+ "Update employee Details   6. Delete Employee Details");
    	Scanner scan = new Scanner(System.in);
    	int choice = scan.nextInt();
    	
    	switch(choice) {
    	case 1: app.getAllEmployeeDetails();
    			break;
    			
    	case 2: app.getCountOfAllEmployees();
    			break;
    			
    	case 3:System.out.println("Enter the employee id whose details you want to see: ");
    			Scanner scanner = new Scanner(System.in);
    			int empId = scanner.nextInt();
    			app.getEmployeeDetailsById(empId);
    			break;
    		
    	case 4:System.out.println("Enter the new employee name and address you want to add: ");
    			try (Scanner sc = new Scanner(System.in)) {
    					String empName = sc.nextLine();
    					String empAddress = sc.nextLine();
    					app.addNewEmployeedetails(empName, empAddress);
    			}
    			break;
    		
    	case 5:System.out.println("Enter the id of an employee whose detials you want to update: ");
    			try (Scanner sn = new Scanner(System.in)) {
    					int empID= sn.nextInt();
    					sn.nextLine();
    					String name = sn.nextLine();    					
    					String empAddress = sn.nextLine();
    					app.updateEmployeeDetails(name, empAddress, empID);
    			}
    			break;
    	
    	case 6:System.out.println("Enter the id of an employee whose detials you want to delete: ");
				try (Scanner sn = new Scanner(System.in)) {
				int id= sn.nextInt();
				app.deleteEmployeeDetails(id);
				}
				break;
    	}
    	   	
    	//System.out.println("");
    	//app.getEmployeeDetailsById();
    }
}
