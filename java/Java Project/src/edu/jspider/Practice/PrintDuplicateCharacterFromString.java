package edu.jspider.Practice;

public class PrintDuplicateCharacterFromString {

	static void duplicate(String s)
	{
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			if(count>1)
				System.out.println(c+" : "+count);
			s=s1;
		}
	}
	public static void main(String[] args) {
		String s="malayalam";
		duplicate(s);
	}
}
