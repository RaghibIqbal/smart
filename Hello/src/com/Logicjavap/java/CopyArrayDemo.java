package com.Logicjavap.java;

public class CopyArrayDemo {

	public static void main(String[] args) {

        int arr1[]=new int[] {5,7,20,10,7,9};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        	
        {
        	arr2[i]=arr1[i];
        }
        System.out.println("After copy one array to another array");
        for(int i=0;i<arr2.length;i++)
        {
     
        System.out.print(arr2[i]+" ");
        }
	}

}
