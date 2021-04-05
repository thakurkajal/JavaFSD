package com.ibm.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        
        EngineeringStudent student = context.getBean("engineeringStudent", EngineeringStudent.class);
        
        student.studyForEmployement();
    
    }
}