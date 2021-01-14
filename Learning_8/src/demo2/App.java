package demo2;

//import demo2.Robot.Battery;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Robot r1 = new Robot(7);
		
		r1.start();
		
		//Robot.Brain brain = r1.new Brain();
		
		//brain.think();
		
		Robot.Battery b1 = new Robot.Battery();
		b1.charge();
		
	}

}
