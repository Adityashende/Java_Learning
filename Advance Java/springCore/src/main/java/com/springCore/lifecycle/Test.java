package com.springCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifeconfig.xml");
	
	S s1=(S) context.getBean("s1");
	System.out.println(s1);
	((AbstractApplicationContext) context).registerShutdownHook();
	
	P p1=(P)context.getBean("p1");
	System.out.println(p1);
	}

}
