package com.IBMTest.java;

public class Test {
	
	static int count,a,b;
	//Test()
	{
		count++;
	}
	{
		a++;
	}
	static
	{
	b++;	
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		System.out.println("total number count:-"+count);
		System.out.println("total number a:-"+a);
		System.out.println("total number b:-"+b);

	}

}
