package com.ArraysP.java;
class Test
{
	public static Test t=null;
	private Test()
	{
		
	}
	public static Test getTest()
	{
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
	
}

public class CreateSingleton {

	public static void main(String[] args) {
		
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		
		

	}

}
