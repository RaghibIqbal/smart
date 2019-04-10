package com.StringProg.java;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

       String str="Hello! I m Raghib Iqbal";
       str=str.replaceAll("\\s+","");
       System.out.println(str);
	}

}
