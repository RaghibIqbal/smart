package com.TRACXN.java;

import javax.jws.soap.SOAPBinding;

public class ArrayAdditioninsinngledigit {
	public static int fun(int r)
	{
		int re=0;
	    int result=0;
		while(r>0)
		{
		re=r%10;
		r=r/10;
		result+=re;	
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {50897459,824,20154789,3000,4,50487,614213,115478};
		int sum=0;
	    int num=0;
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of the Array is= "+sum);
		while(sum>0)
		{
			num=sum%10;
			sum=sum/10;
			result=result+num;	
		}
		System.out.println("Optional result= "+result);
		int original=fun(result);
		System.out.println("Single digit sum of optinal element is= "+original);

	}

}
