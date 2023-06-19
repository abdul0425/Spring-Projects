package edu.jspider.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put(301, "Arshad Alam");
		map.put(201, "Noorii Alam");
		map.put(101, "Mehmed Arsalan");
		System.out.println(map);
//		System.out.println(map.put(301, "Ahmad"));
//		System.out.println(map.get(301));
//		System.out.println(map.containsKey(101));
//		System.out.println(map.containsValue("Mehmed Arsalan"));
//		System.out.println(map.get(401));
//		Set set = map.keySet();
//		System.out.println(set);
//		Collection collection = map.values();
//		System.out.println(collection);
//		Set set2 = map.entrySet();
//		//System.out.println(set2);
//		Iterator itr=set2.iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry m1=(Map.Entry)itr.next();
//			System.out.println(m1.getKey()+" : "+m1.getValue());
//			if(m1.getKey().equals(301))
//				m1.setValue("Ahmad Babu");
//		}
//		System.out.println(map);
	}
}
