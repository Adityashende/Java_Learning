package day5updowncasting;


class Machines{
	public void start() {
		System.out.println("Starting Machine....");
	}
}


interface Plants{
	public void grow();
}

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Machine() {
			@Override public void start() {
				System.out.println("Alredy Started....");
			}
		};
		m1.start();
		
		Plants p1 = new Plants() {
			public void grow() {
				System.out.println("Plant Growing");
			}
		};
	
p1.grow();
	
	}}

