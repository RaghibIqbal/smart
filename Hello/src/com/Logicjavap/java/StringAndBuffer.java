package com.Logicjavap.java;

public class StringAndBuffer {

	public static void main(String[] args) {

      String str1=new String("Durga");
      String str2=str1.concat("Software");
      String str3=str2.concat("Solution");
      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);
      System.out.println();
      
      StringBuffer sb1=new StringBuffer("Durga");
      StringBuffer sb2=sb1.append("Solution");
      StringBuffer sb3=sb2.append("Solution");
      System.out.println(sb1);
      System.out.println(sb2);
      System.out.println(sb3);


	}

}
