package com.ibm.springdemo;

public class Address {
	private String location;
	
/**	Address(String location) {
		this.location = location;
	}
	
	Address(){
		
	}
	
	public String getLocation() {
		return location;
	}
	**/
	
	private String stdName;
	private int stdId;
	private String stdStream;
	
	
	public Address(String stdName, int stdId, String stdStream, String location) {
		this.stdName = stdName;
		this.stdId = stdId;
		this.setStdStream(stdStream);
		this.location = location;		
	}
	
	void Address(){
		
	}
	
	public String getAddress() {
		return location;
	}
	
	/** public void setAddress(Address address) {
		this.address = address;
	} **/
	
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	void studyForEmployement() {
		System.out.println("Student name: " + this.getStdName() + ", with ID: " + this.getStdId());
		System.out.println(" and location: " + this.getAddress());
	}

	public String getStdStream() {
		return stdStream;
	}

	public void setStdStream(String stdStream) {
		this.stdStream = stdStream;
	} 

}
