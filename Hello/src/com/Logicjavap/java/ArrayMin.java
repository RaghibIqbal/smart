package com.Logicjavap.java;

public class ArrayMin {

	public static void main(String[] args) {
		int arr[]= {2,34,5,7,6,66,77,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min value is:"+min);
	}

}
