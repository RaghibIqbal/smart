package com.TRACXN.java;

public class MaxProfit {

	public static void main(String[] args) {
		int arr[]= {142,10,48,52,55,655,899};
		int profit=0,Day1=0,Day2=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]>profit)
				{
					profit=arr[j]-arr[i];
					Day1=i+1;
					Day2=j+1;
				}
			}
		}
		System.out.println("Buy- "+Day1+" -Sell- "+Day2+" -Profit= "+profit);
	
	}

}
