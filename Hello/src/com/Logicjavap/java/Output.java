package com.Logicjavap.java;
class recursion
{
	int fun(int n)
	{
		int result;
		if(n==1)
			return 1;
		result=fun(n-1)*n;
		return result;
	}
	
}

public class Output {

	public static void main(String[] args) {

      recursion obj=new recursion();
      System.out.println(obj.fun(5));

	}

}
