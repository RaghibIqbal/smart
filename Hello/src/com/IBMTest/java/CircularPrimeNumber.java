package com.IBMTest.java;

import javax.jws.soap.SOAPBinding;

public class CircularPrimeNumber {
	static boolean isCircularPrime(int n)
	{
		int temp=n;
		int c=0;
		do
		{
			System.out.println(temp);
			if(isPrime(temp)==false)
			{
				//System.out.println(n+" is Not Circular Prime. ");
				c++;
				break;
			}
			temp=circulate(temp);
		}while(temp!=n);
		//System.out.println(n+" is circular Prime.");
		if(c==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	static boolean isPrime(int t)
	{
		int count=0;
		for(int i=1;i<t/2;i++)
		{
			if(t%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int circulate(int temp) 
	{
		String s=Integer.toString(temp);
		String str=s.substring(1)+s.charAt(0);
		int n=Integer.valueOf(str);
		return n;
	}

	public static void main(String[] args) {
		int n=113;
		boolean b=isCircularPrime(n);
		if(b==true)
		{
			System.out.println(n+" is circular prime.");
		}
		else
		{
			System.out.println(n+" is not Circular Prime.");
		}
		

	}

}
