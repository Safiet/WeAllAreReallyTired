package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		String day = "Friday";
		System.out.println("--------If without braces-------");
		
		if (day.equals("Friday"))

			System.out.println("Today is my movie day");
		System.out.println("Tomorrow I have a class at Syntax");
		
				
		System.out.println("--------If with braces-------");
			//always use braces if you need to have more then one 

		if (day.equals("Friday")) {

			System.out.println("Today is my movie day");
		System.out.println("Tomorrow I have a class at Syntax");
		}
		
		System.out.println("--------End of the Program-------");

	
	}
	
}
