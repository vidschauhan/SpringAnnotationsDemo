package com.example.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class GoodLuckFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Hi, I am goodluck fortune.";
	}

}
