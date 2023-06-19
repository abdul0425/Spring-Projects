package edu.jspider.Array;

public class RemoveDuplicateElementFromArray {

	static int[] duplicate(int[] a) {
		int j = 0;
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length - 1];
		return temp;
	}
	static void duplicateRemove(int[]a)
	{
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
	}

	public static void main(String[] args) {
		int[] a = { 10, 10, 20, 20, 20, 40, 40, 60 };
		int[]temp=duplicate(a);
		System.out.print("Unique Element : ");
		for (int n : temp)
			System.out.print(n + "\t");
		System.out.println();
		System.out.println("=================================================");
		duplicateRemove(a);
		System.out.print("Unique Element : ");
		for (int n : temp)
			System.out.print(n + "\t");
	}
}
