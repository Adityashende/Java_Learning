package demo5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int value = 7;
//		value=value/0;
		
//		String text=null;
//		
//		System.out.println(text.length());
		
		
		String[] texts = {"One","Two","Three"};
		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("Enter valid index");
		}
		
		
	}

}
