package com.StringProg.java;

public class FrequencyCharecter {

	public static void main(String[] args) {

       String str="Raghib Iqbal";
       str=str.toLowerCase();
       int freq[]=new int[str.length()];
       char string[]=str.toCharArray();
       int i,j;
       for( i=0;i<str.length();i++)
       {
    	  freq[i]=1;
    	  for(j=i+1;j<str.length();j++)
    	  {
    		  if(string[i]==string[j])
    		  {
    			  freq[i]++;
    			  string[j]='0';
    		  }
    	  }
       }
       System.out.println("charecter and there corresponding frequency");
       for( i=0;i<freq.length;i++)
       {
    	   
       if(string[i]!=' '&&string[i]!='0')
       {
    	 System.out.println(freq[i]+"  "+string[i]);  
       }

	}

}
}
