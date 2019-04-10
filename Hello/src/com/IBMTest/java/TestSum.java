package com.IBMTest.java;

import java.util.Arrays;

public class TestSum {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==5)
				{
					
					System.out.println("The number is:"+i+ "and"+j);
					
				}
				
				
			}
			
		}
		
	}
}
		
	



