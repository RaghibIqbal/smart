package com.Logicjavap.java;

public class Number1to100 {

	public static void main(String[] args) {
	printNumber( 1);
		//int Number=1;
		//printNumber(Number);
	}
	public static void printNumber(int Number)
	{
		if(Number<=100)
		{
			System.out.println(Number);
		
		Number++;
		printNumber(Number);
	  }
	
	/**else
	{
		
	System.exit(0);
	}*/
	}
	
	}

