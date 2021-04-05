package com.ibm.eis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoClass implements DaoInterface{
	Connection dbCon;
	String queryToExecute;
	Statement theStatement;
	ResultSet resultSet;

	public void DaoInterfacemethod(){
//		Declare the URL to connect
    	String urlToConnect = "jdbc:mysql://localhost:3306/companyibm";
    	
//    	Declare the Username and Password of the DB to connect
    	String userName = "root";
    	
    	String userPassword = "";
    	

    	try {
//    	     #1 Load the DB Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			#2 Try establishing the connection
			dbCon = DriverManager.getConnection(urlToConnect, userName, userPassword);
	    	
			try {
//	        	Get a reference to the Statement
				theStatement = dbCon.createStatement();
			} catch (SQLException e) {
				System.out.println("Some issues while getting Statement : " + e.getMessage());
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to db : " + e.getMessage());
		}
	}
}