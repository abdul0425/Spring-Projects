package edu.jspider.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
		map.put(501, "Rivu Naskar");
		map.put(301, "Akhil pandu");
		map.put(101, "Arshad Alam");
		map.put(401, "Sashti Mondal");
		map.put(201, "Mehmed Arsalan");
		System.out.println(map);
		System.out.println(map.put(301, "Keerthana"));
		System.out.println(map);
		System.out.println(map.get(301));
		System.out.println(map.containsKey(101));
		System.out.println(map.containsKey(901));
		System.out.println(map.containsValue("Keerthana"));
		Set<Entry<Object, Object>> set = map.entrySet();
//		System.out.println(set);
		Iterator<Entry<Object, Object>> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry =(Map.Entry)iterator.next();
			if(entry.getKey().equals(301))
			{
				entry.setValue("Sai Pallvi");
			}
		}
		System.out.println(map);
	}
}
