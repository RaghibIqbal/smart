package com.IBMTest.java;


import java.util.*;
public class Student
{
	int rollno;
	String name;
	int age;
	public Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}

	public String toString()
	{
		
		return " "+rollno;
	}

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Sonoo",23);  
		Student s2=new Student(102,"Raj",23);
		Student s3=new Student(103,"Md",22);
		
		ArrayList<Student>  al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al.toString());
	}

}
