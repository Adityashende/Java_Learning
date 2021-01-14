package demo2;

public class Robot {
	
	private int id;
	private String name="Robert";
	
	private class Brain{
		public void think() {
			System.out.println("Robot "+id+" thinking...");
		}
	}

	static class Battery{
		public void charge() {
			System.out.println("Battery charging....");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	
	public Robot(String name) {
		this.name = name;
	}




	public void start() {
		System.out.println("Starting Robot..."+id);
		
		Brain b1 = new Brain();
		b1.think();
		
		class Temp{
			public void doSomething() {
				System.out.println("ID is: "+id);
				System.out.println("My name is: "+name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
	
	
	
	

}
