package com.ibm.kajal.training;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class App {
    public static void main( String[] args ){
    	
//      Load the Context
    	ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("appContext.xml");
    	    	
//    	Get the bean reference
//   	DataDao dao = theContext.getBean("dataDao", DataDao.class);
    	NamedParamDemo para = theContext.getBean("namedParamDemo", NamedParamDemo.class);
    	    	
//    	Call the method on bean
    	//dao.connectToDb();
    	//System.out.println("Number of Employees currently registered :" + dao.getCountOfEmployees());
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the employee id whose details you want to see: ");
    	int empId = scan.nextInt();
    	System.out.println(para.getEmployeeDetailsByEmployeeId(empId));
    	
    	String empName = scan.nextLine();
		String empAddress = scan.nextLine();
    	System.out.println(para.updateEmployeeDetails(empName, empAddress, empId));
    	System.out.println(para.deleteEmployeeDetails(empId));
    	
    	
    	
    	//Employee emp = dao.getAllDetailsOfEmployee(empId);  
    	//System.out.println(emp);
    	
    	//List<Employee> listOfEmployee = dao.getAllEmployees();
    	
    	//listOfEmployee.forEach(System.out::println);
    	
/**    	System.out.println("Please enter the operation you wnat to perform...");
    	
    	System.out.println("1.Add New Employee 2.Update Employee Details 3.Delete Employee Details");
    	int option = scan.nextInt();
    	switch(option) {
    	case 1: System.out.println("Enter the new employee Id, name and address: ");
    	
    			int empId = scan.nextInt();
    			scan.nextLine();
    			String empName = scan.nextLine();
    			String empAddress = scan.nextLine();
    			dao.addEmployee(new Employee(empId, empName, empAddress)); 
    			System.out.println("New employee details added");
    			break;
    		
    	case 2: System.out.println("Enter the Id of an employee whose details you want to update: ");
    			int employeeId = scan.nextInt();
    			scan.nextLine();
    			String employeeName = scan.nextLine();
    			String employeeAddress = scan.nextLine();
    			dao.updateEmployeeDetails(new Employee(employeeName, employeeAddress, employeeId));
    			System.out.println("Employee details updated");
    			break;
    		
    	case 3: System.out.println("Enter the Id of an employee whose details you want to delete: ");
    			int employeeID = scan.nextInt();	
    			dao.deleteEmployeeDetails(new Employee(employeeID));
				System.out.println("Employee details deleted");
				break;
				
		default: System.out.println("Enter the valid operation number among 1 to 3 for which you want to perform an operation...");
		break;
    	}
**/    	
    }
}
