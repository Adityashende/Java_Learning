package day1;
// Methods Parameter 


class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping " + height);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot sam = new Robot();
		sam.speak("I am sam");
		
		sam.jump(7);
		
	}

}
