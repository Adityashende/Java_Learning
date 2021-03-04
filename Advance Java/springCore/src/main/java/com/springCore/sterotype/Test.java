package com.springCore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springCore/sterotype/config.xml");

		Student s1 = (Student) con.getBean("ob",Student.class);

		System.out.println(s1);
		System.out.println(s1.getAddress());
	}
}