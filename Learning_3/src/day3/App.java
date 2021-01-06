package day3;

class Thing {
	
	public static int count;
	
	public String name;
	//static variable
	public static String description;
	
	public int id;
	//instance method can access staic variable because ny that time static is already allocated memory
	public void showName() {
		System.out.println(id +" "+description+" "+name);
	}
	//static method declaration
	
	public static void info() {
		System.out.println(description);
	}
	public Thing() {
		id=count;
		count++;
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining static variable and accessing it using class name
		
		Thing.description="I am a thing";
		System.out.println(Thing.description);
		
		//calling static method using class name
		Thing.info();
		
		
		Thing t1 = new Thing();
		Thing t2= new Thing();
		
		t1.name = "Bob";
		t2.name = "Gob";
		
		System.out.println(t1.name+" "+t2.name);
		
		t1.showName();
		t2.showName();
		
	}

}
