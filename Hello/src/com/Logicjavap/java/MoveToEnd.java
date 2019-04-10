package com.Logicjavap.java;

import java.util.Arrays;

public class MoveToEnd {
	public static int[] backToEnd(int arr[],int n)
	{
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[k++]=arr[i];
			}
			
		}
		while(k<n)
		{
			arr[k++]=0;
		}
		return arr;
		
	}
		public static void main(String[] args) {
			
			int arr[]= {2,0,9,6,0,4,0,68,75,0};
			int n=arr.length;
			arr=backToEnd(arr,n);
			System.out.println(Arrays.toString(arr));
		
		}

	}


