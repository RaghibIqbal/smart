package com.Logicjavap.java;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		int result[]= {1,1,1,1,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				result[i]*=arr[j];
			}
			for(int k=arr.length-1;k>i;k--)
			{
				result[i]*=arr[k];
			}
		}
		for (int i : result) {
			System.out.println(i);
			
		}
	}

}
