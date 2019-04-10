package com.Logicjavap.java;

import java.util.Arrays;

public class MissingnumberDemo {

	public static void main(String[] args) {

      int arr[]= {1,2,3,4,5,7};
      int missingNumber=getMissingNumber(arr,7);
      System.out.printf("Missing number in aaray %s is %d %n",Arrays.toString(arr),missingNumber);
	}
	private static int getMissingNumber(int[] arr,int n)
	{
		int actualSum=0;
		int excepectedSum=(n*(n+1)/2);
		for(int i:arr)
		{
			actualSum=actualSum+i;
		}
		return excepectedSum-actualSum;

	}

}