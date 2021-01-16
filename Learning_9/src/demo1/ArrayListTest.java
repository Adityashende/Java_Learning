package demo1;

//import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(10);
		number.add(500);
		number.add(100);
		
		System.out.print("The number you have entered are: "+number.get(0)+" "+number.get(1)+" "+number.get(2));
		System.out.println("\nFor loop Iteration Result:");
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}
		
		System.out.println("\nFor-each loop iteration: ");
		for (Integer value:number) {
			System.out.println(value);
		}

		//List<String> value = new ArrayList<String>();
	}

}
