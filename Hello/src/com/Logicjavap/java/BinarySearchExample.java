package com.Logicjavap.java;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {

        int arr[]= {20,3,7,30,57,95};
        int key=30;
        
        int results=Arrays.binarySearch(arr, key);
        if(results<0)
        {
          System.out.println("is not found index:");
          
        }
        else
        {
        	System.out.println("Element of index found:"+results);
        }

	}

}
