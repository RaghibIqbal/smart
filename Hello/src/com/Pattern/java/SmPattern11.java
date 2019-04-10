package com.Pattern.java;

import java.util.Scanner;

public class SmPattern11 {

	public static void main(String[] args)
	
	{
      Scanner sc = new Scanner(System.in);
      
       int array[] = new int [10];
       for(int i=0;i<array.length;i++)
		array[i] = sc.nextInt();
		for(int i = 0;i<array.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(array[i]);
				
			}
			else
			{
			 char ch=(char)array[i];
			 System.out.println(ch);
			}
			
		}
		
		
	}

	}


