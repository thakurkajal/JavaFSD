package com.ibm.kajal.ui;

import java.util.Scanner;

import com.ibm.kajal.Person;
import com.ibm.kajal.service.ServiceClass;
import com.ibm.kajal.service.ServiceInterface;

public interface Main {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			ServiceInterface service = new ServiceClass();
			
			System.out.println("Enter the name of the person: ");
			String name = scan.nextLine();
			
			System.out.println("Enter the address of the person: ");
			String address= scan.nextLine();
			
			System.out.println("Enter the age of the person: ");
			int age = scan.nextInt();
			
			Person person = new Person();
			person.setName(name);
			person.setAddress(address);
			person.setAge(age);
			
			service.storeValue(person);
			
			System.out.println(service.displayValue());
		}

}
