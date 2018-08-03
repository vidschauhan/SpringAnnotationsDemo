package com.example.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BadLuckFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Badluck fortune";
	}

}
