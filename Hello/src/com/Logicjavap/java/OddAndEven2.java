package com.Logicjavap.java;

import java.util.Scanner;

public class OddAndEven2 {

	public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        String str="";
        if(n%2==1)
        {
            str="weird";           
        		
        }
        else
        {
        	if(n>=2&&n<=5)
        	{
        		str="not weird";
        	}
        	else if(n>=6&&n<=20)
        	{
        		str="weird";
        	}
        	else
        	{
        		str="not weird"; 
        	}
        }
        
        System.out.println(str);
	}
}
