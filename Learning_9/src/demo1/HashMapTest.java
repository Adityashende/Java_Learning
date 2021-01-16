package demo1;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(5,"Five");
		map.put(6,"Six");
		map.put(7,"Seven");
		map.put(8,"Eight");
		map.put(9,"Nine");
		map.put(1,"One");
		
		map.put(6,"ten");
		
		String text= map.get(6);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":"+value);
		}
		

	}

}
