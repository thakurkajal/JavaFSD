package com.ibm.kajal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("anEnginneer")
public class AnnotationEngineer implements Engineer{
	
	@Autowired		//using here we don't required constructor and setter method
	Address address;
	
	
	@Autowired
	List<String> branchOfEngineers;
	
	public Address getAddress() {
		return address;
	}

	@Override
	public void workForWages() {
			System.out.println("The address of an annotation enginner is: " + getAddress().getLocation() + "," + getAddress().getPincode());
			System.out.println("Branches of Engineers are: ");
			for(String engineers : branchOfEngineers)
				System.out.println(engineers);
	}
	
}
