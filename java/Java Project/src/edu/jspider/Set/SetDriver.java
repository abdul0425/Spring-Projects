package edu.jspider.Set;

public class SetDriver {

	public static void main(String[] args) {
		Set s=new Set();
		System.out.println(s.add(50));
		System.out.println(s.add(10));
		System.out.println(s.add(30));
		System.out.println(s.add(50));
		System.out.println(s.add(20));
		System.out.println(s.add(50));
		
		s.display();
	}
}
