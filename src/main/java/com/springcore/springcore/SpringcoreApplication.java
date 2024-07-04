package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringcoreApplication {

	public static void main(String[] args) {
		// Initialize Spring ApplicationContext using configuration.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		// Retrieve student1 bean from Spring container
		Student student1 = (Student) context.getBean("student1");
		System.out.println("Student 1: " + student1);

		// Retrieve student2 bean from Spring container
		Student student2 = (Student) context.getBean("student2");
		System.out.println("Student 2: " + student2);
	}

}
