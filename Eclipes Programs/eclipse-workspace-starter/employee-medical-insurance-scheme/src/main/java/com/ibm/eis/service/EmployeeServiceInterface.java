package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeServiceInterface {
	void setEmployeeDetails(Employee emp);
	
	Map<Integer, Employee> displayEmployeeDetails();

}
