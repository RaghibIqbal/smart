package com.OppsTest.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Testhash {
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter No:");
		BigInteger b=new BigInteger(sc.next());
		boolean c=b.isProbablePrime(50);
		if(c)System.out.println("Prime");
		else System.out.println("not prime");
		
		
		
	

	}

}
