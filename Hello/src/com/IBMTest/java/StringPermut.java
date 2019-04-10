package com.IBMTest.java;

import java.util.Scanner;

public class StringPermut {
	public static void permut(char[] array,int k)
	{
		if(k==array.length)
		{
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i=k;i<array.length;i++)
			{
				char temp=array[k];
				array[k]=array[i];
				array[i]=temp;
				
				permut(array,k+1);
				
				temp=array[k];
				array[k]=array[i];
				array[i]=temp;
			}
		}
	}
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length:");
	char array[]=new char[sc.nextInt()];
	System.out.println("Enter a Original char:");
	for(int i=0;i<array.length;i++)
	{
		array[i]=sc.next().charAt(0);
	}
	permut(array,0);
	sc.close();
	

	}

}
