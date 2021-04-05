package com.ibm.kajal.bankproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.kajal.bankproject.user.UserAccountInfo;

//import com.ibm.springdemo.EngineeringStudent;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
         
         UserAccount user = context.getBean("userAccount", userAccount.class);
         
         user.displayInfo(null, 0, 0);
    }
}
