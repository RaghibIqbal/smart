package com.OppsTest.java;

public class Test1 {

	static int count=0;
	{
		count++;
	}


	public static void main(String[] args) {
      Test1 t1=new Test1();
      Test1 t2=new Test1();
      Test1 t3=new Test1();
      Test1 t4=new Test1();
      System.out.println(count);

	}

}
