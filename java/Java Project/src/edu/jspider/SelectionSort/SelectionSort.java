package edu.jspider.SelectionSort;

public class SelectionSort {

	static void selection(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		selection(a);
		System.out.println("Sorted Array : ");
		for(int n:a)
			System.out.println(n);
	}
}
