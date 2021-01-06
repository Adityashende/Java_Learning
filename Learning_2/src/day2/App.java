package day2;

class Frog{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//name=newName;
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name,int age) {
		setName(name);
		setAge(age);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog f1 = new Frog();
		
		f1.setName("Pin");
		f1.setAge(5);
		
		System.out.println(f1.getName() + " "+f1.getAge());
		
	}

}
