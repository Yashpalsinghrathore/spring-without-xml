package com.exmple1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);

		Demo d = (Demo) context.getBean("demo");
		
		System.out.println(d);
	}

}
