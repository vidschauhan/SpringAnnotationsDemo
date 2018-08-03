package com.example.SpringJavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports {

	private Fortune fortune;
	
	@Autowired
	public Cricket(@Qualifier("goodLuckFortune")Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getSportName() {
		return "Cricket";
	}
	
	public String getFortune() {
		return fortune.getDailyFortune();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
