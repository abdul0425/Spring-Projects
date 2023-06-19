package edu.jspider.BalancedString;

import java.util.Stack;

public class BalancedString {

	static boolean isBalanced(String s)
	{
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
				st.push(c);
			else if(c==']'||c=='}'||c==')')
			{
				if(st.isEmpty())return false;
				if(!isPair(st.pop(),c))return false;
			}
		}
		return st.isEmpty();
	}
	static boolean isPair(char c1,char c2)
	{
		if(c1=='['&&c2==']')return true;
		if(c1=='{'&&c2=='}')return true;
		if(c1=='('&&c2==')')return true;
		
		return false;
	}
	public static void main(String[] args) {
		String s="[{()}][]{}()";
		System.out.println("Balanced String : "+isBalanced(s));
	}
}
