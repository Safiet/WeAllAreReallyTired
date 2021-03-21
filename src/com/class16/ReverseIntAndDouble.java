package com.class16;

public class ReverseIntAndDouble {

	public static void main(String[] args) {
		
		int sallary=10000214;
		StringBuilder sb=new StringBuilder(String.valueOf(sallary));
		sb.reverse();
		sallary=Integer.parseInt(sb.toString());
		System.out.println(sallary);
	
		
		double salary=154.1;
		   StringBuilder var=new StringBuilder(String.valueOf(salary));  // converting a double to String and a string to String Builder
		   System.out.println(var.reverse());
		    
		    double salary1=0.00001;
		    String s=String.valueOf(salary1);
		    String converted="";
		    for(int i=s.length()-1;i>=0;i--) {
		    	converted+=s.charAt(i);
		    	  }System.out.println(converted);
}
	

}
