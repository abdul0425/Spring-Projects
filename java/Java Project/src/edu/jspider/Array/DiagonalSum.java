package edu.jspider.Array;

public class DiagonalSum {

	static int leftSum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i][i];
		return sum;
	}

	static int rightSum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i][a.length - 1 - i];
		return sum;
	}

	static int diagonalsSum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i][i];
		for (int j = 0; j < a.length; j++) {
			if (j == a.length / 2)
				continue;
			sum += a[j][a.length - j - 1];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println("Left Sum : " + leftSum(a));
		System.out.println("Right Sum : " + rightSum(a));
		System.out.println("Diagonals Sum : " + diagonalsSum(a));
	}
}
