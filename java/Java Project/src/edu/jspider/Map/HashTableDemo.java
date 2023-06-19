package edu.jspider.Map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		Temp1 t1=new Temp1(1);
		Temp1 t2=new Temp1(21);
		Temp1 t3=new Temp1(5);
		Temp1 t4=new Temp1(8);
		Temp1 t5=new Temp1(29);
		Temp1 t6=new Temp1(43);
		Temp1 t7=new Temp1(6);
		Temp1 t8=new Temp1(9);
		Temp1 t9=new Temp1(11);
		Temp1 t10=new Temp1(20);
		hashtable.put(t1, "A");
		hashtable.put(t2, "B");
		hashtable.put(t3, "C");
		hashtable.put(t4, "D");
		hashtable.put(t5, "E");
		hashtable.put(t6, "F");
		hashtable.put(t7, "G");
		hashtable.put(t8, "H");
		hashtable.put(t9, "I");
		hashtable.put(t10, "J");
		
		System.out.println(hashtable);
	}
}
class Temp1
{
	int i;
	Temp1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		return i%11+"";
	}
	@Override
	public int hashCode() {
		return i%11;
	}
}