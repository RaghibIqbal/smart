package com.Logicjavap.java;

public class LinearSearchDemo {
	public static int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {

        int arr[]= {2,30,50,70,5,40};
        int key=5;
        System.out.println(key+"is found at index:"+linearSearch(arr,key));
        

	}

}
