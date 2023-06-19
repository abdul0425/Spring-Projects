package edu.jspider.Array;

public class RemoveDuplicate {

	static int[] duplicate(int[]a)
	{
		int j=0;
		int[]temp=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		return temp;
	}
	public static void main(String[] args) {
		int[]a= {10,10,20,30,30,40,40,50};
		int[] temp=duplicate(a);
		for(int n:temp)
			System.out.print(n+" ");
	}
}
