package com.ibm.kajal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myProperty.properties")
@Component
public class Address {
	
	@Value("${engineer.location}")
	private String location;
	
	@Value("${engineer.pincode}")
	private int pincode;
	
	public String getLocation() {
		return location;
	}
	
	public int getPincode() {
		return pincode;
	}
}
