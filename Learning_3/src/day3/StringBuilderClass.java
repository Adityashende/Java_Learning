package day3;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String info ="";
		
		info += "I am a boy";
		info += " ";
		info += "I am a builder";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is bob").append(" ").append("I am tainer");
		System.out.println(sb.toString());
		
		//formatting
		
		System.out.print("Here is a text.\tThat was a tab\nThat was a newLine\n");
		System.out.printf("Total cost %10d;quantity is %d\n",5,20);
		System.out.printf("\nTotal value %10.2f\n",5.6);
	
	
	
	
	}

}
