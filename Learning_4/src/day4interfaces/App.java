package day4interfaces;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Machine();
		
		m1.start();
		
		Person p1 = new Person("Bob");
		
		p1.greet();
		m1.showInfo();
		
		p1.showInfo();
		
		Info f1 = new Machine();
		f1.showInfo();
		
		Info f2 = p1;
		f2.showInfo();
		
		outputInfo(p1);

	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
