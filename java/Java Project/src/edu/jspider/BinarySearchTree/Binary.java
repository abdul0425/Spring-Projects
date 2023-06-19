package edu.jspider.BinarySearchTree;

public class Binary {

	private Node root;
	private int count;

	public boolean add(int e) {
		if (root == null) {
			root = new Node(e);
			count++;
			return true;
		}
		Node curr = root;
		Node prev = null;
		while (curr != null) {
			prev = curr;
			if (e < curr.e) {
				curr = curr.left;
			} else if (e > curr.e) {
				curr = curr.right;
			} else
				return false;
		}
		if (e < prev.e) {
			prev.left = new Node(e);
		} else {
			prev.right = new Node(e);
		}
		count++;
		return true;
	}

	public int size() {
		return count;
	}
}
