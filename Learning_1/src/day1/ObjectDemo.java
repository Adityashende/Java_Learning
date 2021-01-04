package day1;


class Person{
	
	//Instance variable
	
	String name;
	int age;
	
	//subroutine(methods)
	
	void speak() {
		System.out.println("Person can speak");
	}
	
	int calculateAge() {
		int yearLeft=65-age;
		System.out.println(yearLeft);
		return yearLeft;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.name= "Aditya";
		p1.age=20;
		
		Person p2 = new Person();
		p2.name="Shende";
		p2.age=37;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		p1.speak();
		p2.speak();
		int year=p1.calculateAge();
		System.out.println(year);
	}

}
