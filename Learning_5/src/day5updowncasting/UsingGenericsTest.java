package day5updowncasting;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{}

public class UsingGenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Before Java 5/////////////////
		 ArrayList list = new ArrayList();
		 
		 list.add("apple");
		 list.add("banana");
		 list.add("orange");
		 
		 String fruit = (String)list.get(1);
		 System.out.println(fruit);

		 
		 ////////Modern Style/////////////
		 
		 ArrayList<String> strings= new ArrayList<String>();
		 
		 strings.add("cat");
		 strings.add("Dog");
		 strings.add("Lion");
		 strings.add("Aligator");
		 
		 String animal = strings.get(1);
		 
		 System.out.println(animal);
		 
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
		 
		 /////Java 7/////
		 
		 ArrayList<Animal> someList = new ArrayList<>();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
