package edu.jspider.MergeSort;

public class MergeSort {

	static void split(int[]a)
	{
		if(a.length==1)return;
		int[]left=new int[a.length/2];
		int[]right=new int[a.length-left.length];
		int i;
		for(i=0;i<left.length;i++)
			left[i]=a[i];
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[i];
			i++;
		}
		split(left);
		split(right);
		merge(left,right,a);
	}
	
	static void merge(int[]a,int[]b,int[]c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
	}
	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		split(a);
		System.out.println("Sorted Array : ");
		for(int n:a)
			System.out.println(n);
	}
}
