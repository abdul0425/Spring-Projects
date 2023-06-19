package edu.jspider.Set;

import java.util.TreeSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set h = new TreeSet();
//		h.add("Bubai");
//		h.add("Rivu");
//		h.add("Akhil");
//		h.add("Arshad");
//		h.add("Rohan");
//		h.add("Kunj");
//		System.out.println(h);
//		for(Object e:h)
//			System.out.println(e);
		h.add(60);
		h.add(30);
		h.add(10);
		h.add(70);
		h.add(40);
		h.add(50);
		for(Object e:h)
		{
			System.out.println(e);
		}
	}
}
