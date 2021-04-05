package com.ibm.eis.service;

import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.eis.service.ServiceClass;
import com.ibm.eis.dao.*;

public class ServiceClass implements ServiceInterface{
	String queryToExecute;
	Statement theStatement;
	DaoClass dao = new DaoClass();
	
	/** @override
	public boolean validateUserName(String userName) {
		if(userName.matches(USERNAMEPATTERN))
			return true;
		else
			return false;
	} **/
	
	
	public void updateEmployeeData(int Id, String Name, int Salary, String Designation) {
		  queryToExecute = "UPDATE employee SET Id='"+ Id+"', Name='"+ Name+"',Salary='"+ Salary+"', Designation='"+ Designation+"' WHERE ID='"+Id+"'";
		  	try {
//					Execute the query
					theStatement.executeUpdate(queryToExecute); 
						System.out.println("New Employee details added successfully.");
					
				} catch (SQLException e) {
					System.out.println("Some issues while inserting : " + e.getMessage());
				}
		  }
}
