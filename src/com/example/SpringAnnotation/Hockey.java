package com.example.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Hockey implements Sports {

	@Override
	public String getSportName() {
		return "Hockey";
	}

	@Override
	public String getFortune() {
		return null;
	}

	@Override
	public String getFirstName() {
		return null;
	}

	@Override
	public String getRole() {
		return null;
	}

}
