package com.ibm.eis.ui;

import java.util.Scanner;
import com.ibm.eis.service.ServiceClass;
import com.ibm.eis.service.ServiceInterface;

public class LayeredDemo {
	
	Scanner scan = new Scanner(System.in);
			
	LayeredDemo() {
		System.out.println("Enter employee id: ");
		int id = scan.nextInt();
		
		System.out.println("Enter employee salary");
		int salary = scan.nextInt();
		
		System.out.println("Enter employee name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter employee designation: ");
		String designation = scan.nextLine();
		
		ServiceInterface service = new ServiceClass();
		service.updateEmployeeData(id, name, salary, designation);
	} 

	public static void main(String[] args) {
			System.out.println("Welcome to layered ");
			/** String cname;
			while(true) {
				System.out.println("Enter name: ");
				cname = sc.nextLine();
						
				 boolean isValid = service.validateUserName(cname);
				if(isValid)
					break; **/
		}
}