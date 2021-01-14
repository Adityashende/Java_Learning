package day4accessModifier;

public class Plant {
	
	public String name;
	
	public final static int ID=10;
	private String type;
	protected String size;
	
	public Plant() {
		this.name = "Freddy";
		
		//access within the class
		this.size="Large";
		this.type="Oak";
	}

}
