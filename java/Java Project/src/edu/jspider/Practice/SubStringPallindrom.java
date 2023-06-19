package edu.jspider.Practice;

public class SubStringPallindrom {

	static void subString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String s1=s.substring(i, j);
				if(isPallindrom(s1))
					System.out.println(s1);
			}
		}
	}
	static boolean isPallindrom(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="malayalam";
		subString(s);
	}
}
