package com.example.SpringJavaConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Hockey implements Sports {

	Fortune fortune;
	
	public Hockey(Fortune fortune) {
		this.fortune=fortune;
	}

	@Override
	public String getSportName() {
		return "Hockey";
	}

	@Override
	public String getFortune() {
		return fortune.getDailyFortune();
	}

	@Override
	public String getFirstName() {
		return "firstName";
	}

	@Override
	public String getRole() {
		return "role";
	}

}
