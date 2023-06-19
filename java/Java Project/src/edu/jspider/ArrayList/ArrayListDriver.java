package edu.jspider.ArrayList;

public class ArrayListDriver {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad");
		l.add("Arsalan");
		l.add("Noorii");
		l.add("Raja", 2);
		l.add("Fatma", 3);
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println(name);
		}
		System.out.println("===============");
		l.remove(3);
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println(name);
		}
	}
}
