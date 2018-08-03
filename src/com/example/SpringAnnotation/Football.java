package com.example.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Football implements Sports {
	
	@Autowired
	@Qualifier("badLuckFortune")
	private Fortune fortune;
	@Value("${name}")
	private String firstName;
	private String lastName;
	@Value("${role}")
	private String role;
	
	
	@Override
	public String toString() {
		return firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Football() {
		System.out.println("inside FootBall constructor");
	}
	@Override
	public String getSportName() {
		return "getSportName : Football";
	}

	@Override
	public String getFortune() {
		return "getFortune : " + fortune.getDailyFortune();
	}

	@Override
	public String getRole() {
		return this.role;
	}

	
}
