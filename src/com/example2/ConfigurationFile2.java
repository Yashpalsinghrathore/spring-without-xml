package com.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile2 {

	@Bean
	public Demo getDemo()
	{
		
		Demo d = new Demo();
		
		d.setAddress(getAddress());
		d.setI(10);
		
		return d;
		
		
	}
	
	@Bean
	public Address getAddress()
	{
		
		return new Address("dhar");
		
	}
}
