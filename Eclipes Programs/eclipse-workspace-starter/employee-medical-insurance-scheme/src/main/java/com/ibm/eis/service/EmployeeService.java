package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.EmployeeDAOClass;
import com.ibm.eis.EmployeeDAOInterface;
import com.ibm.eis.bean.Employee;

public class EmployeeService implements EmployeeServiceInterface{
	
	EmployeeDAOInterface dao = new EmployeeDAOClass();

	@Override
	public void setEmployeeDetails(Employee emp) {
		dao.setEmployeeDetails(emp);
		
	}

	@Override
	public Map<Integer, Employee> displayEmployeeDetails() {
		return dao.displayEmployeeDetails();
		
	}	
	

}
