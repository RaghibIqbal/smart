package com.Logicjavap.java;

public class CountLenCoopunsDotCom {

	public static void main(String[] args) {
		String str="agdtrhad";
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(!s.contains(""+str.charAt(i)))
			{
				s=s+""+str.charAt(i);
			}
			/**else
			{
				continue;
			}**/
		}
		//System.out.println(s);
		System.out.println(s.length());

	}

}
