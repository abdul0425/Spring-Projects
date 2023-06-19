package edu.jspider.BubbleSort;

public class BubbleSort {

	static void bubble(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		bubble(a);
		System.out.println("Sorted Array : ");
		for(int n:a)
			System.out.println(n);
	}
}
