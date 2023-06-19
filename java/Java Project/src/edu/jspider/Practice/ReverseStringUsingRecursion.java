package edu.jspider.Practice;

public class ReverseStringUsingRecursion {

	static String reverse(String s)
	{
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		return s1;
	}
	static String recursion(String s)
	{
		if(s.length()<2)
			return s;
		return recursion(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		String s="mehmed";
		System.out.println("Reverse : "+reverse(s));
		System.out.println("Reverse : "+recursion(s));
	}
}
