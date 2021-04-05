package com.ibm.kajal.spring_starter;

import java.util.List;

public class Engineer {
	
	String engName;
	int engId;
	//Address address;
	private List<Address> listOfAddress;
	
	public Engineer() {
		
	}
	
	public Engineer(String engName, int engId, List<Address> listOfAddress) {
		this.engName = engName;
		this.engId = engId;
		this.listOfAddress = listOfAddress;
	}

	public List<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

/**	public Engineer(String engName, int engId, Address address) {
		this.engName = engName;
		this.engId = engId;
		this.address = address;
	} **/


	public String getEngName() {
		return engName;
	}


	public void setEngName(String engName) {
		this.engName = engName;
	}


	public int getEngId() {
		return engId;
	}


	public void setEngId(int engId) {
		this.engId = engId;
	}
	
	
	void workForWages() {
		System.out.println("Engineer name is: " + engName + " with ID: " + engId);
		System.out.println("The places engineer visite is :");
		for(Address address : listOfAddress) {
			System.out.println("Location: " + address.getLocation() + " Pincode: " + address.getPincode());
		}
		//System.out.println(" and address is: " + address.getLocation() + " with pincode: " + address.getPincode());
	}
}
