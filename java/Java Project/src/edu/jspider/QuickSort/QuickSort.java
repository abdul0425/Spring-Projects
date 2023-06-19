package edu.jspider.QuickSort;

public class QuickSort {

	static void quick(int[]a,int start,int end)
	{
		if(start>=end)return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		quick(a,start,j);
		quick(a,i,end);
	}
	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		quick(a,0,a.length-1);
		System.out.println("Sorted Array : ");
		for(int n:a)
			System.out.println(n);
	}
}
