package com.Logicjavap.java;

import java.util.HashMap;
import java.util.Scanner;

public class ExampleDemo {

	public static void main(String[] args) {

Scanner scr=new Scanner(System.in);
     
System.out.println("Enter the any sentence");
int count=0;
String str="";
str=scr.nextLine();
str=str.toLowerCase();

if(str==",")
{
	str.equals("");
	count++;
}
System.out.println(str);
System.out.println( count);



HashMap h=new HashMap();
  
h.put("a",1);
h.put("and",3);
h.put("contains",2);
h.put("has",1);
h.put("is",1);
h.put("it",2);
h.put("paragraph",2);
h.put("sntences",2);
h.put("seprators",1);
h.put("this",2);
h.put("three",1);
h.put("words",2);

System.out.print(h);

	}

}
