package demo5;

import java.util.Iterator;
import java.util.LinkedList;


public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Rabbit");
		animals.add("Fox");
		animals.add("cat");
		animals.add("dog");
		
		Iterator<String> it =  animals.iterator();

		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if(value.contentEquals("cat")) {
				it.remove();
			}
		}
		System.out.println();
		
		
	}
	
	

}
