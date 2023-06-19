package edu.jspider.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		Temp t1=new Temp(1);
		Temp t2=new Temp(2);
		//map.put(t1, "Arshad");
		//map.put(t2, "Arsalan");
		//System.out.println(map);
		//System.out.println("After Assingning t1=null : ");
		//t1=null;
		//System.out.println(map);
		// In case of WeakHashMap the GC will desroy the abandoned object.
		WeakHashMap<Object, Object> map2 = new WeakHashMap<>();
		map2.put(t1, "Arshad");
		map2.put(t2, "Noorii");
		System.out.println(map2);
		t1=null;t2=null;
		System.gc();
		System.out.println(map2);
	}
}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+"";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Executed");
	}
}
