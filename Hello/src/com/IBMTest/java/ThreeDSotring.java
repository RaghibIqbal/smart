package com.IBMTest.java;
import java.util.Arrays;
public class ThreeDSotring {
		public static void main(String[] args) {
			int arr[][][]= {
					       {
					    	   {8,7,3},
					           {11,2,4},
			                   {17,10,5}
					        },
			                   
			                {     
					        	{4,2,1},
			                    {9,5,8},
			                	{15,11,18}
			                 },
			                
			                 {
			                	 {20,21,17},
			                     {99,50,66},
			                	 {100,55,44}
			                 }
			                 };
			                	   
					
			int temp;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					for(int k=0;k<arr.length;k++)
					{
						for(int m=1;m<arr.length;m++)
						{
						
						if(arr[i][j][m-1]>arr[i][j][m])
						{
							temp=arr[i][j][m-1];
							arr[i][j][m-1]=arr[i][j][m];
							arr[i][j][m]=temp;
							
						}
						}
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					for(int k=0;k<arr.length;k++)
					{
						System.out.print(arr[i][j][k]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}

		}

	}
