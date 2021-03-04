package com.springCore.lifecycle;

public class S {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public S() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside init");
	}

	public void destroy() {
		System.out.println("Inside destroy");
	}

}
