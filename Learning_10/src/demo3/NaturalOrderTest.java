package demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	public String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		
		return name.compareTo(person.name);
	}
	
}

public class NaturalOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<Person>();
		
		Set<Person> set =  new TreeSet<Person>();
		
		addElements(list);
		addElements(set);
		
		//Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
	}

	private static void addElements(Collection<Person> col) {
		
		col.add(new Person("Joe"));
		col.add(new Person("Koe"));
		col.add(new Person("Aoe"));
		col.add(new Person("Poe"));
		col.add(new Person("Toe"));
	}
	
	private static void showElements(Collection<Person> col) {
		
		for(Person element:col) {
			System.out.println(element);
		}
	}
}
