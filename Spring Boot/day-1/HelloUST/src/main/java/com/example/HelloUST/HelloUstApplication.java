package com.example.HelloUST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloUstApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(HelloUstApplication.class, args);
//		Person person=context.getBean(Person.class);
		System.out.println(context.getBeanDefinitionCount());
//		System.out.println(context.);
	}
}