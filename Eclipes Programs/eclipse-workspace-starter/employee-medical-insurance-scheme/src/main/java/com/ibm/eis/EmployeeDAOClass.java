package com.ibm.eis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeService;
import com.ibm.eis.service.EmployeeServiceInterface;

public class EmployeeDAOClass implements EmployeeDAOInterface{
	 
	 	private Map<Integer, Employee> employee = new HashMap<Integer, Employee>();

		@Override
		public void setEmployeeDetails(Employee emp) {
			employee.put(1, emp);
			
		}

		@Override
		public Map<Integer, Employee> displayEmployeeDetails() {
			return employee;
			
		}	

}
