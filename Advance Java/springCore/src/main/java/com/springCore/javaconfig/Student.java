package com.springCore.javaconfig;

import org.springframework.stereotype.Component;

@Component("fs")
public class Student {
	
	private Employee employee;
	
	

	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public void study() {
		this.employee.display();
		System.out.println("Hello There !!!");
	}

}
