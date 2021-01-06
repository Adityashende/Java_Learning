package day2;

class Machine {
	
	private String name;
	private int age;
	
	public Machine() {

		
		this("Aditya",0);
		System.out.println("Constructor running");
		
	}
	
	public Machine(String name) {
		this(name,9);
		System.out.println("Second Constructor");
		this.name=name;
	}
	public Machine(String name,int age) {
		System.out.println("Third constructor");
		this.name=name;
		this.age=age;
	}
}


public class ConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		
		//new Machine("Adi");
		//new Machine("Adi");
	}

}
