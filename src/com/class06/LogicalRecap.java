package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		/*
		 * we need to get a time
		 * 
		 * based on the time we need to identify what is the time of day if time is
		 * between 1 to 11--->morning if time is between 12 to 13-->noon if time is
		 * between 14-17-->afternoon if time is between 18-21-->evening if time is
		 * between 22-24-->night
		 */
		Scanner scan;
		int time;
		String timeOfTheDay = null;
		scan= new Scanner(System.in);
		System.out.println("Please enter time in 24 hour format");
        time=scan.nextInt();
        
        if(time>=1 && time<=11) {
        	timeOfTheDay="Morning";        	
        }else if (time>=12 && time<=13) {
        	timeOfTheDay="Noon";
        }else if (time>=14 && time<=17) {
        	timeOfTheDay="Afternoon";
        }else if (time>=18 && time<=21) {
        	timeOfTheDay="Evening";
        }else if (time>=22 && time<=24) {
        	timeOfTheDay="Night";
        }
        System.out.println("The time of the day is " + timeOfTheDay);
	
	/* if you dont used else you have to initialize values;
	 * compiler can initialize variables to their default values: null 
	 * default value of int--->0
	 * default for value if double-->0.0
	 * default for boolean --->true
	 * default value of String and all non primitives-->null 
	 */
	
	}
	
	

}
