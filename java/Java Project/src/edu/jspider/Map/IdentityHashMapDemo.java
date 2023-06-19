package edu.jspider.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		String s1=new String("Arshad");
		String s2=new String("Arshad");
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		
		IdentityHashMap<Object, Object> map = new IdentityHashMap<>();
		map.put(i1, "Mehmed");
		map.put(i2, "Noorii");
		System.out.println(map);
		
		map.put(s1, "Mehmed Arsalan");
		map.put(s2, "Noorii Alam");
		System.out.println(map);
	}
}
