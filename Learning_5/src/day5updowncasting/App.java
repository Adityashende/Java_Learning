package day5updowncasting;

class Machine{
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Snapped");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine m1 = new Machine();
		Camera c1 = new Camera();
		
		m1.start();
		c1.start();
		
		//upcasting
		
		Machine m2 = c1;
		m2.start();
		
		//DownCasting
		
		Machine m3 = new Camera();
		Camera c2=(Camera)m3;
		c2.start();
		c2.snap();
		
		
		c2.start();
		c2.snap();
		
	}

}
