package com.class08;

import java.util.Scanner;

public class DoWhileLoopReview {

	public static void main(String[] args) {
		/*
		 * we need to make a user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more then 3 then we want to say please give less money
		 * if user gives us less then 3 then we will ask to give more money 
		 *  
		 */
		Scanner input;
		int num;
		int Number = 3;
		input = new Scanner(System.in);
		System.out.println("Please pay for soda");
		
		do {
				num = input.nextInt();
			if (num>3) {
				System.out.println("Please give less money");
			}else if (num<3) {
				System.out.println("Please give more money");
			}
		} while (num != Number);
		System.out.println("Thank you for your purchase");
	}}