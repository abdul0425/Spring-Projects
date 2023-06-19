package edu.jspider.LinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Arshad");
		list.add("Rivu");
		list.add("Akhil");
		list.add("Keerthana");
		list.add("Vanitha");
		list.add("Pallavi");

		for (int i = 0; i < list.size(); i++) {
			String friends = (String) list.get(i);
			System.out.println(friends);
		}
		System.out.println("==============");
		list.add("Prabhas", 2);
		for (int i = 0; i < list.size(); i++) {
			String friends = (String) list.get(i);
			System.out.println(friends);
		}
		System.out.println("==============");
		list.remove(6);
		for (int i = 0; i < list.size(); i++) {
			String friends = (String) list.get(i);
			System.out.println(friends);
		}
		System.out.println("==============");
		list.reverse();
		for (int i = 0; i < list.size(); i++) {
			String friends = (String) list.get(i);
			System.out.println(friends);
		}
		System.out.println("==============");
	}
}
