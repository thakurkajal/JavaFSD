package com.ibm.kajal.dao;

import java.util.Map;

import com.ibm.kajal.Person;

public interface DAOInterface {
		void storeValue(Person person);
		
		Map<Integer, Person> displayValue();
		
}
