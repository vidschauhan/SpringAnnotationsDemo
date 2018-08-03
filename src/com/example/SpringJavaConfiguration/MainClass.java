package com.example.SpringJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// Put the applicationcontext.xml on src folder.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

	
		//Created bean in SpringConfig file to get instance of Hockey class.
		Sports sport = context.getBean("football", Sports.class);
		System.out.println(sport.getSportName());

		// using dependency injection
		System.out.println(sport.getFortune());

		System.out.println("Literal injection :" + sport.getFirstName());
		System.out.println("loading from propertied file : role = " + sport.getRole());
		context.close();
	}

}
