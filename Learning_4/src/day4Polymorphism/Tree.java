package day4Polymorphism;

public class Tree extends Plant{

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Growing");;
	}

	public void shedL() {
		System.out.println("Leaves shed");
	}
}
