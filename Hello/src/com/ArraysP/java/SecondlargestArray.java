package com.ArraysP.java;

public class SecondlargestArray {

	public static void main(String[] args) {

        int arr[]= {1,2,3,7,11,9,10};
        
        int largest=arr[0];
        
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>largest)
        	{
        		secondLargest=largest;
        		largest=arr[i];
        	}
        	else if(arr[i]>secondLargest)
        	{
        		secondLargest=arr[i];
        	}
        	
        }
        System.out.println("SecondLargest  "+secondLargest);

	}

}
