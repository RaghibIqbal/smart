package com.TRACXN.java;

import java.util.Arrays;

public class Bumb {

	public static void main(String[] args) {
		int arr[][]= {{ 0,-1, 0, 0,-1},
		              {-1, 0,-1,-1, 0},
		              { 0,-1, 0, 0,-1},
		              {-1, 0, 0,-1,-1},
		              { 0,-1, 0,-1, 0}};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==-1)
				
					for(int k=i-1;k<=i+1&&k<arr.length;k++)
					{
						if(k<0)
							continue;
						
						for(int m=j-1;m<=j+1&&m<arr.length;m++)
						{
							if(m<0)
								continue;
							
							if(arr[k][m]==0)
								count++;
							
						}
						
					
				}
				if(count>0)
				{
					arr[i][j]=count;
					count=0;
				}
			}
			
		}
		for(int [] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		
		
	}	

}
