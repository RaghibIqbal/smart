package com.Logicjavap.java;

public class BubbleSortExample {
	static void bubbleSort(int arr[])
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
		for(int j=1;j<n-i;j++)
		{
			if( arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		}
	
	}

	public static void main(String[] args) {

       int arr[]= {3,60,7,67,45,5,40,8,9,34};
       
       System.out.println("Before bubble sort");
       for(int i=0;i<arr.length;i++)
       {
    	  System.out.println(arr[i]+" ");
    	  
       }
       System.out.println();
       bubbleSort(arr);
       System.out.println("After bubble Sort");
       for(int i=0;i<arr.length;i++)
       {
       System.out.println(arr[i]+"");
       }
	}

}
