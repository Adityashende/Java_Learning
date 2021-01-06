package day3;

class Frog{
	
	private String name;
	private int id;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}

public class ToStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog f1 = new Frog(1,"Freddy");
		Frog f2 = new Frog(2,"Foggy");
		
		System.out.println(f1);
		System.out.println(f2);
		 
		 

	}

}
