package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class P implements InitializingBean,DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public P() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "P [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking p");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Finish");
		
	}

}
