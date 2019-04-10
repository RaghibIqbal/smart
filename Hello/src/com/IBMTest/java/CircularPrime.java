package com.IBMTest.java;

public class CircularPrime {
	public static boolean isCircularPrime(int n)
	{
		boolean c=true;
		int a=n;
		do {
			if(isPrime(a)==false)
			{
				c=false;
				break;
			}
			a=circulate(a);
		}while(a!=n);
		if(c==true)
			return true;
		return false;
	}
	public static boolean isPrime(int m)
	{
		int flag=0;
		for(int i=1;i<=m/2;i++)
		{
			if(m%i==0)
			{
				flag++;
			}
		}
		if(flag==1)
			return true;
		return false;
		
	}
	public static int circulate(int a)
	{
		String s=Integer.toString(a);
		String result=s.substring(1)+s.charAt(0);
		int d=Integer.parseInt(result);
		return d;
	}

	public static void main(String[] args) {
		int n=3119;
		boolean b=isCircularPrime(n);
		System.out.println(b);

	}

}//1193,1931,9311,3119
