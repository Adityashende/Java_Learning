package day4;

public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}

	public void showInfo() {
		System.out.println("Car name: "+name);
	}
	
}
