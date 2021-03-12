package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day
		 * 
		 * if day is Tuesday or Wednesday -->Manual class
		 * if day Monday or Friday --> no class
		 * if day is saturday or sunday--->Java class
		 * if day is thursday-->review class
		 */
		
		
		String day="Monday";
		
		if (day.equals("Monday")  ||  day.equals("Friday")) {
			System.out.println("Today i have no class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today i have manual class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today i have Review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today i have a Java class");
		}else {
			System.out.println(day + " is Invalid");
		}
	}

}
