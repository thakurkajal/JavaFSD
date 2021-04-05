package com.ibm.eis;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeDAOInterface {
	
	void setEmployeeDetails(Employee emp);
	Map<Integer, Employee> displayEmployeeDetails();

}
