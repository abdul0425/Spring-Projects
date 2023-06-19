package edu.jspider.Array;

public class MultiplyArray {

	static void multiply(int[][] a, int[][] b, int[][] c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < c.length; k++)
					c[i][j] = a[i][k] * b[k][j];
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 1, 2 }, { 3, 4 } };
		int l = a.length;
		int[][] c = new int[l][l];
		multiply(a, b, c);
		System.out.println("Sum of Array's : ");
		for (int[] t : c) {
			for (int n : t) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}
}
