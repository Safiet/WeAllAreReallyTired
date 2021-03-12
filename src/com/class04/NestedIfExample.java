package com.class04;

public class NestedIfExample {

	public static void main(String[] args) {
		/*
		 * to donate:
		 * you must be 18 and older, otherwise you cannot
		 * your weight must be more than 110 lbs, otherwise you cannot donate
		 * 
		 * 
		 */
		int age=19;
		int weight=126;
		
	if (age>=18) {
		System.out.println("You eligible to donate");
		if (weight>110) {
			System.out.println("You quailify");
		}else {
			System.out.println("Not qialified");
		}
	}else {
		System.out.println("You cannot");
	}
	}

}
