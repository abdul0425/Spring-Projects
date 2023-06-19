package edu.jspider.Exception;

import java.io.FileInputStream;

public class Demo {

	static void sum(int[][]a)
	{
		int sum=0;
		for(int j=0;j<a.length;j++)
			sum+=a[j][j];
		for(int i=0;i<a.length;i++)
		{
			if(a.length/2%2!=0)
				continue;
			else
				sum+=a[i][a.length-i-1];
		}
		System.out.println("Diagonal Sum : "+sum);
	}
	public static void main(String[] args) {
		int[][]a= {
				{10,20,30,30},
				{40,50,60,60},
				{70,80,90,90},
				{10,20,30,40}
		};
		sum(a);
}
}
