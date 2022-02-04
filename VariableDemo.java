package com.madhu.variables;

public class VariableDemo
{
	int a = 45; // instance 
	int b = 30; // instance
	
	static int x = 10; // static
	static int y = 25; // static
	
	void add()
	{
		int m = 20; // local
		int n = 30; // local
		int p = m+n;
		System.out.println("addition of local variables : "+p);
	}
	
	public static void main(String[] args)
	{
		// int c = a+b;
		VariableDemo vd = new VariableDemo();
		int c = vd.a + vd.b;
		System.out.println("Addition of instance variables : "+c);
		int z = x+y;
		System.out.println("Addition of static variables : "+z);
		vd.add();
	}
}
