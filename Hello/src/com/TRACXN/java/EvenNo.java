package com.TRACXN.java;

public class EvenNo {
	public static int result(int a,int count)
	{
		int sum=0;
		int i=2;
		while(count>0)
		{
			sum=sum+i;
			i=i+2;
			count--;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14};
		int a=2;
		int count=7;
		int sum=result(a,count);
		System.out.println("Sum of All Even no Set:-  "+sum);
		}
	}


