package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore.javaconfig")
public class javaConfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
