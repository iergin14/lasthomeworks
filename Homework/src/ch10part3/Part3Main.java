package ch10part3;

import java.util.*;
import java.util.TreeMap;

public class Part3Main {
	static Map PersonWithName = new TreeMap();
	static Map PersonWithLastname = new TreeMap();
	static Map PersonWithAddress = new TreeMap();
	static Map PersonWithPhone = new TreeMap();

	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			Person s = new Person("String name" + i, "String lastname"+ i, "String address"+ i, "String phoneNumber"+ i);
			PersonWithName.put(s.name, s);
			PersonWithLastname.put(s.lastname, s);
			PersonWithAddress.put(s.address, s);
			PersonWithPhone.put(s.phoneNumber, s);
		}
		
		System.out.println("Person with name");
		Set names = PersonWithName.keySet();
		Iterator iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			Person s = (Person) PersonWithName.get(name);
		
		}
        
		
		System.out.println("\nGiving a comparator");
		Comparator<String> lastNameComparator = (s1, s2) -> s1.compareTo(s2);
		Map personByLastName = new TreeMap(lastNameComparator);
		for (int i = 10; i > 8; i--) {
			Person s = new Person("String name" + i, i + "String lastname", "String address"+ i, "String phoneNumber"+ i);
			personByLastName.put(s.lastname, s);
		}
		
		personByLastName.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}