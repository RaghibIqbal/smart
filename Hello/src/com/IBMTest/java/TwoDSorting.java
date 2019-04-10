package com.IBMTest.java;

import java.util.Arrays;

public class TwoDSorting {

	public static void main(String[] args) {
		int arr[][]= {{8,7,3},
		              {11,2,4},
		              {17,10,5}};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=1;k<arr.length;k++)
				{
					if(arr[j][k-1]>arr[j][k])
					{
						temp=arr[j][k-1];
						arr[j][k-1]=arr[j][k];
						arr[j][k]=temp;
					}
				}
			}
		}
		for(int[]a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		                      

	}

}
