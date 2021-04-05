package com.ibm.kajal;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.kajal.AnnotationEngineer;


@Configuration
public class App 
{
    public static void main( String[] args )
    {
    	try (//Load the XML File
    			ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationConfig.xml")) {
    				//Fetch the bean from container
    		AnnotationEngineer enginner = theContext.getBean("anEnginneer", AnnotationEngineer.class);
    				
    				//call methods on the bean object
    				enginner.workForWages();
   		}
    }
    
    
    @Bean
    List<String> branchOfEngineers(){
    	return Arrays.asList("Computer", "Chemical", "Civil", "Mechanical");
    }
}
