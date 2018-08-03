package com.example.SpringJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("values.properties")
@ComponentScan
//@ComponentScan("com.example.SpringJavaConfiguration")
public class SpringConfiguration {
	
	// Allows to create new instance of the bean.
	@Bean
	public Fortune badLuckFortune() {
		return new BadLuckFortune();
	}
	
	/*Injecting bean to Hockey class for dependency Injection. Where constructor
	receives the value from Main class. where
	context.getBean("hockey",Sports.class);*/
	@Bean
	public Sports hockey() {
		return new Hockey(badLuckFortune());
	}

}
