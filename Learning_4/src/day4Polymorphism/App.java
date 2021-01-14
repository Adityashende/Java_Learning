package day4Polymorphism;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant p1 = new Plant();
		Tree t1 =new Tree();
		
		Plant p2 = t1;
		
		p2.grow();
		
		t1.shedL();
		
		
		doGrow(t1);
		
		

	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
