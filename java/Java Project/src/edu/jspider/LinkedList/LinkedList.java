package edu.jspider.LinkedList;

public class LinkedList {

	private Node first;
	private int count;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node curr = first;
		while (curr.next != null)
			curr = curr.next;
		curr.next = new Node(e, null);
		count++;
	}

	public void add(Object e, int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = new Node(e, first);
			count++;
		}
		Node curr = first;
		for (int i = 1; i < index; i++)
			curr = curr.next;
		curr.next = new Node(e, curr.next);
		count++;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node curr = first;
		for (int i = 1; i <= index; i++)
			curr = curr.next;
		return curr.ele;
	}

	public void remove(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = first.next;
			count--;
		}
		Node curr = first;
		for (int i = 1; i < index; i++)
			curr = curr.next;
		curr.next = curr.next.next;
		count--;
	}

	public int size() {
		return count;
	}

	public void reverse() {
		Node prev = null, curr = first, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		first = prev;
	}
}
