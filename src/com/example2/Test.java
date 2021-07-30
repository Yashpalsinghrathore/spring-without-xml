package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.example2.Demo;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile2.class);

		Demo d = (Demo) context.getBean("getDemo");
		
		System.out.println(d);

	}

}
