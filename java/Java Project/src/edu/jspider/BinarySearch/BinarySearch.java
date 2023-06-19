package edu.jspider.BinarySearch;

public class BinarySearch {

	static int binary(int[] a, int s) {
		int start = 0, end = a.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (s == a[mid])
				return mid;
			else if (s < a[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	static int binary(int[] a, int start, int end, int s) {
		if (start >= end)
			return -1;
		int mid = (start + end) / 2;
		if (s == a[mid])
			return mid;
		else if (s < a[mid])
			return binary(a, start, mid - 1, s);
		else
			return binary(a, mid + 1, end, s);
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(binary(a, 0, a.length - 1, 80));
		System.out.println(binary(a, 20));
	}
}
