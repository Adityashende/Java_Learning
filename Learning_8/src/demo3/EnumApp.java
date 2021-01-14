package demo3;

public class EnumApp {

	public static final int DOG=0;
	public static final int CAT=1;
	public static final int MOUSE=2;
	public static final int LION=3;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal= Animal.CAT;
		
		switch (animal) {
		case CAT:
			System.out.println("Meow...");
			break;
		case DOG:
			System.out.println("Bark...");
			break;
		case LION:
			System.out.println("Roar...");
			break;
		case MOUSE:
			System.out.println("Chi...");
			break;
		default:
			break;
		
		
		}
		System.out.println(Animal.DOG);
		
		System.out.println("Enum name as a string: "+Animal.CAT.name());
		
		System.out.println(Animal.CAT.getClass());
		
		System.out.println(Animal.CAT instanceof Enum);
		
		System.out.println(Animal.CAT.getName());
		
		Animal a2 = Animal.valueOf("CAT");
		
		System.out.println(a2);

	}

}
