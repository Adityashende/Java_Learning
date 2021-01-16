package demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		
		doTiming("ArrayList",arrayList);
		doTiming("LinkedList",linkedList);
	}
	
	private static void doTiming(String type,List<Integer> list) {
//		
//		for (int i = 0; i < 1E5; i++) {
//			list.add(i);
//		}
		
		long start = System.currentTimeMillis();
		
		//End of the list
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		//Add items in elsewhere in list
		for (int i = 0; i < 1E5; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: "+(end-start)+" ms for "+type);
		
	}

}
