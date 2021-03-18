package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
	
		String var="This is a demo of contain # ,%";   // checking if we have special character in the string 
		
		System.out.println(var.contains("$")||var.contains("%"));
		
		if (var.contains("$")|| var.contains("%")) {
			
			System.out.println("$,% are not allowed");
			
		}
		System.out.println(var.contains("This is a demo of")); //checking everything inside the string
		
		System.out.println(var.startsWith("demo")); //check with what word you start string
		
		System.out.println(var.endsWith("%")); // check with what word String finish

	}

}
