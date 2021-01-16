package demo1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1 = new HashSet<String>();

		Set<String> l1 = new LinkedHashSet<String>();

		Set<String> t1 = new TreeSet<String>();

		s1.add("dog");
		s1.add("cat");
		s1.add("snake");

		l1.add("dog");
		l1.add("cat");
		l1.add("snake");

		t1.add("dog");
		t1.add("cat");
		t1.add("snake");

		for (String value : s1) {
			System.out.println(value);
		}

		System.out.println();

		for (String value1 : l1) {
			System.out.println(value1);
		}

		System.out.println();

		for (String value2 : t1) {
			System.out.println(value2);
		}

		if (s1.contains("llll")) {
			System.out.println("Found");
		} else {
			System.out.println("Not Valid!!");
		}

		////// Intersection/////////////
		
		Set<String> t2 = new TreeSet<String>();
		
		t2.add("dog");
		t2.add("cat");
		t2.add("snake");
		t2.add("tiger");
		t2.add("ant");
		
		Set<String> inter = new LinkedHashSet<String>(t2);
		
		System.out.println(inter);
		
	
		
		System.out.println(inter.retainAll(t2));
		
	}

}
