package com.springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext cont = new AnnotationConfigApplicationContext(javaConfig.class);
		Student s1 = cont.getBean("getStudent", Student.class);
		s1.study();
		//System.out.println(s1);
	}

}
