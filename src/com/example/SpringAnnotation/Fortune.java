package com.example.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public interface Fortune {

	public String getDailyFortune();
}
