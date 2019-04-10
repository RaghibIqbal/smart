package com.OppsTest.java;
public class Testol1 {
	public void methodOne(int i)
	{
		System.out.println("int-arg method");
	}
	public void methodOne(float f)
	{
		System.out.println("float-arg method");
	}

	public static void main(String[] args) {
		Testol1 t=new Testol1();
		 t.methodOne('a');
		 t.methodOne(10.5f);
		//t.methodOne(10.5);

	}

}
