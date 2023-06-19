package edu.jspider.Oct28Demo;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.Oct28.Person;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person("Mehmed", 1);
		Person person2 = new Person("Ahmed", 2);
		Person person3 = new Person("Arsalan", 3);
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
	}
}
