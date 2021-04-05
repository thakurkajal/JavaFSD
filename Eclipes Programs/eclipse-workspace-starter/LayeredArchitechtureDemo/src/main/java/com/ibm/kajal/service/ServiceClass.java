package com.ibm.kajal.service;

import java.util.Map;

import com.ibm.kajal.Person;
import com.ibm.kajal.dao.DAOClass;
import com.ibm.kajal.dao.DAOInterface;

public class ServiceClass implements ServiceInterface {
	
	DAOInterface dao = new DAOClass();
	
	public void storeValue(Person person) {
		dao.storeValue(person);
	}
	
	
	public Map<Integer, Person> displayValue(){
		return dao.displayValue();
	}

}
