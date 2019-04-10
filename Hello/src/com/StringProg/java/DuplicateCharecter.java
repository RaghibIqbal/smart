package com.StringProg.java;

public class DuplicateCharecter {

	public static void main(String[] args) {

       String str="Raghibb iqqbal";
       
       int count;
       
       char ch[]=str.toCharArray();
       
       System.out.println("Duplicate charecter in given string");
       
       for(int i=0;i<ch.length;i++)
       {
    	   
    	   count=1;
    	   for(int j=i+1;j<ch.length;j++)
    	   {
    		   
    		  if(ch[i]==ch[j] && ch[i]!=' ')
    		   {
    			   count++;
    			
    			   ch[i]='0';
    		   }
    	   }
      
       
    	   if(count>1&&ch[i]!='0')
    		  
    		   System.out.println(ch[i]);
    	   
       } 
         

	}
}


