package edu.jspider.Set;

public class Demo {

	public static void main(String[] args) {
		A b1=new B();
		b1.m();
	}
}
class A
{
	static void m()
	{
		System.out.println(1);
	}
}
class B extends A
{
	static void m()
	{
		
		System.out.println("Overridden m() ");
	}
	
}
