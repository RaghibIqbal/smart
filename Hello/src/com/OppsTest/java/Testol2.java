package com.OppsTest.java;

public class Testol2 {
	public void methodOne(String s)
	{
		System.out.println("String- version");
	}
	public void methodOne(StringBuffer s)
	{
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) {
	     
		Testol2 t=new Testol2();
		t.methodOne("arun");
		t.methodOne(new StringBuffer("sai"));
		//t.methodOne(null);
		//t.methodOne('s');

	}

}
