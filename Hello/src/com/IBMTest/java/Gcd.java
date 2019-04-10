package com.IBMTest.java;

public class Gcd {
	public static int gcd(int x,int y)
	{
		if(x==0||y==0)
			return 0;
		if(x==y)
		    return x;
		if(x>y)
			return gcd(x-y,y);
		return gcd(x,y-x);
			
	}

	public static void main(String[] args) {
		int a=34,b=48;
		int result=gcd(a,b);
		System.out.println(result);
		

	}

}
