package com.ibm.kajal.spring_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       try (//Load the XML File
		ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationConfig.xml")) {
			//Fetch the bean from container
    	   SoftwareEngineer enginner = theContext.getBean("softwareEngineer", SoftwareEngineer.class);
			
			//call methods on the bean object
			enginner.workForWages();
		}
    }
}
