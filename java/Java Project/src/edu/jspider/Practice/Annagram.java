package edu.jspider.Practice;

public class Annagram {

	static boolean isAnnagram(String s1,String s2)
	{
		while(s1.length()==s2.length())
		{
			if(s1.length()==0&&s2.length()==0)return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
		}
		return false;
	}
	public static void main(String[] args) {
		String s1="rowdy";
		String s2="dowry";
		System.out.println(isAnnagram(s1,s2));
	}
}
