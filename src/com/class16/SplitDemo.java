package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
	
		String var1="Today is Wednesday";
		
		System.out.println(var1.length());
		
		String[] strArr= var1.split(" "); // split String to arrays
		
		for(String word:strArr) {
			System.out.println(word);
		}
		
		String var2="Syntax is best. batch9 is great.";
		String[] strArr2=var2.split("[.]");
		
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]); // method chaining
			
			String var3="           SYNTAX           ";
			
			System.out.println(var3.trim().toLowerCase());
		}

	}

}
