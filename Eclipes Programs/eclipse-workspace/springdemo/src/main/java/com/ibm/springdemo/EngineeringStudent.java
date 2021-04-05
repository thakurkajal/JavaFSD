package com.ibm.springdemo;

public class EngineeringStudent implements Student{
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	EngineeringStudent(){
		
	}
	
	EngineeringStudent(Address address){
		this.address = address;
	}
	
	public void studyForEmployement() {
		System.out.println(this.getAddress());
	}
	
	public void callAtBeginning() {
		System.out.println("Instantiated...");
	}
	
	public void callAtEnd() {
		System.out.println("Destroyed...");
	}
}
