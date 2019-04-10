package com.OppsTest.java;

class A
{
	static int i=m1();
	static int m1()
	{
		System.out.println("m1-A");
		return 10;
		
	}
	static {
		System.out.println("m1-B");
	}
}

public class TestStatic {

	public static void main(String[] args) {

      A a=new A();

	}

}
