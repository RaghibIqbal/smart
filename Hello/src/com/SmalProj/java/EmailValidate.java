package com.SmalProj.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {

	public static void main(String[] args) {
		
		String email="raghibiqbal14@gmail.com";
		
		System.out.println(valEmail(email));

	}
	public static boolean valEmail(String input)
	{
		String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		
		Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		
		Matcher matcher=emailPat.matcher(input);
		
		return matcher.find();
	}
	
}
