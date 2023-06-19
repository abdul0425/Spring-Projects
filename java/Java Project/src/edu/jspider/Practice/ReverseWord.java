package edu.jspider.Practice;

public class ReverseWord {

	static String reverse(String s)
	{
		String s1="";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			s1=s1+word(a[i])+" ";
		}
		return s1;
	}
	static String word(String s)
	{
		if(s.length()<2)
			return s;
		return word(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		String s="mehmed arsalan is my son";
		System.out.println("Reverse Sentence : "+reverse(s));
	}
}
