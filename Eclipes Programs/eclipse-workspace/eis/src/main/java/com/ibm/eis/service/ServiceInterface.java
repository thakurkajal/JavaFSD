package com.ibm.eis.service;


public interface ServiceInterface {
	//public static final String USERNAMEPATTERN= "[A-Z] [a-z] {9}";
	//boolean validateUserName(String userName);
	void updateEmployeeData(int Id, String Name, int Salary, String Designation);
}
