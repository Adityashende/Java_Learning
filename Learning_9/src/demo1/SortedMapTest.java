package demo1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hasMap=new HashMap<Integer,String>();

		LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		testMap(hasMap);
		System.out.println();
		testMap(linkedHashMap);
		System.out.println();
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer,String> map) {

		map.put(9,"fox");
		map.put(4,"giraffe");
		map.put(3,"dog");
		map.put(2,"snake");
		map.put(1,"rabbit");
		map.put(7,"bear");
		map.put(8,"tiger");
		map.put(10,"cat");
		map.put(45,"elephant");
		
		for(Integer keys: map.keySet()) {
			String value = map.get(keys);
			
			System.out.println(value);
		}
		
	}

}
