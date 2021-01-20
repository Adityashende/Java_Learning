package demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1>len2) {
			return 1;
		}else if(len1<len2) {
			return -1;
		}
		
		return 0;
	}
}
class AlphabeticalComparator implements Comparator<String>{
	
	@Override
	public int compare(String s1,String s2) {
		return s1.compareTo(s2);
	}
}


public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> animal = new ArrayList<String>();
		
		animal.add("cat");
		animal.add("snake");
		animal.add("elephant");
		animal.add("ant");
		
		//Collections.sort(animal,new StringLengthComparator());
		Collections.sort(animal,new AlphabeticalComparator());
		
		
		for(String animals: animal) {
			System.out.println(animals);
		}
		
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(40);
		num.add(15);
		num.add(2);
		
		
		//Collections.sort(num);
		
		Collections.sort(num,new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return  -num1.compareTo(num2);
			}
		});
		
		
		for(Integer nums:num) {
			System.out.println(nums);
		}
		
		List<Person> people= new ArrayList<Person>();
		
		people.add(new Person(1,"Joe"));
		people.add(new Person(4,"Doe"));
		people.add(new Person(3,"Sam"));
		people.add(new Person(2,"Ice"));
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				if(p1.getId()>p2.getId()) {
					return 1;
				}else if(p1.getId()<p2.getId()) {
					return-1;
				}
				
				
				return 0;
			}
			
		});
		
		for(Person person:people) {
			System.out.println(person);
		}
	}

}
