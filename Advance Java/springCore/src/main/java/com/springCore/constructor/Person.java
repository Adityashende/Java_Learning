package com.springCore.constructor;

public class Person {

	private String name;
	private int id;
	private Certi certi;
	

	public Person(String name, int id,Certi certi) {
		this.name = name;
		this.id = id;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return "Name:"+this.name+":"+this.id+""+this.certi;
	}

}
