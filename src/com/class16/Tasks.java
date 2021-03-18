package com.class16;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Student Safiet
		 * 
		 * Task1
		 * Create a String that will hold a sentence.
		 *  Write a program to get a new String without any spaces.
		 *  
		 *  Task2
		 *  Create a String that should be combination of letters, numbers and special characters. 
		 *  Find out how many alpha characters are there in the String.
		 * 
		 *  
		 *  Task3
		 *  You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
		 *   How would you find out how many sentences are in that String?
		 */

		
		
		//task1		
		String task1="Hello World";
		System.out.println(task1.replace(" ", ""));

		
		//task2
		String task2="asfasfASfAPSF12124124(#*&*##%R@";
		String task2_1=task2.replaceAll("[^a-zA-z]", "");
				System.out.println(task2_1.length());
				
				
				//task3 
				 String a="Is it saturday? Is it raining? Do we have a Java Class today?";
				 String[] b = a.split("[?]");
					System.out.println(b.length);
				 
				 
	}

}
