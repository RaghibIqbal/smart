package com.TRACXN.java;

import javax.jws.soap.SOAPBinding;

public class Mulwith532 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%15==0)
			{
				sum=sum+i*5;
			}
			else if(i%5==0)
			{
				sum=sum+i*3;
			}
			else if(i%3==0)
			{
				sum=sum+i*2;
			}
			else
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
