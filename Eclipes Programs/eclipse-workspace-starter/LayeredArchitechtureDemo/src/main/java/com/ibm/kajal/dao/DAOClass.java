package com.ibm.kajal.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.kajal.Person;

public class DAOClass implements DAOInterface{
	
	private Map<Integer, Person> persons= new HashMap<Integer, Person>();

	@Override
	public void storeValue(Person person) {
		persons.put(1, person);
	}

	@Override
	public Map<Integer, Person> displayValue() {
		return persons;
	}

}
