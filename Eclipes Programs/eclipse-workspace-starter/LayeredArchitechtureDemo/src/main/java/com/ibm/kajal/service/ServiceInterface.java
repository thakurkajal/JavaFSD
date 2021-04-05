package com.ibm.kajal.service;

import java.util.Map;

import com.ibm.kajal.Person;

public interface ServiceInterface {
	
	void storeValue(Person person);
	
	Map<Integer, Person> displayValue();
}
