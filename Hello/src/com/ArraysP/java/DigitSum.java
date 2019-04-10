package com.ArraysP.java;

public class DigitSum {
	public static void digitSumm(int inputNumber)
    {
 	   int inputNumberSum=inputNumber;
 	   int sum=0;
 	   while(inputNumberSum!=0)
 	   {
 		 int  digitsumTotal=inputNumberSum%10;
 		 
 		   sum=sum+digitsumTotal;
 		   
 		   inputNumberSum=inputNumberSum/10;
 	   }
 	   System.out.println("total digit sum  "+sum);
    }

	public static void main(String[] args) {
		
		digitSumm(38736);
		digitSumm(12345);

	}

}
