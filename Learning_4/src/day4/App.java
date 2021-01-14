package day4;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Machine();
		
		Car c1 = new Car();
		m1.start();
		m1.stop();
		c1.showInfo();
		c1.start();
		c1.stop();

	}

}
