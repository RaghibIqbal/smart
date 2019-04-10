package com.Pattern.java;

public class SirjiPattern {

	public static void main(String[] args) {
		int r=7;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				
				if(j<=5-i||j>=3+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
