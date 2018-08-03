package com.example.SpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// Put the applicationcontext.xml on src folder. 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		// first parameter should match as bean id defined in appcontext.xml and second
		// is for interface it is implementing
		Sports sport = context.getBean("football",Sports.class);
		System.out.println(sport.getSportName());
		
		// using dependency injection
		System.out.println(sport.getFortune());
		
		System.out.println("Literal injection :"+sport.getFirstName());
		System.out.println("loading from propertied file : role = " +sport.getRole());
		context.close();
	}

}
