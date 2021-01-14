package demo3;

public enum Animal {
	
	DOG("Pluto"),CAT("Dora"),MOUSE("Jerry"),LION("Simba");
	
	private String name;
	
	 Animal(String name) {
		
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public String toString() {
		 return "This animal is called "+name;
	 }
}
