package com.class08;

import java.util.Scanner;

public class Task4_1 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 * 
		 */

		Scanner input = new Scanner(System.in);
		String item;
		int price;
		int money;
		int sum = 0;
		int remainder;

		System.out.println("PLease enter an item you would like to buy ?");
		item = input.nextLine();

		System.out.println("Please enter the price of " + item);
		price = input.nextInt();
		System.out.println("Please pay us " + price + " dollars");

		do {
			
			money = input.nextInt();
			sum += money;
			
			if (sum< price) {
				
				remainder = price - sum;
				System.out.println("Please pay us " + remainder + " more dollars");

			} else if (sum > price) {
				
				remainder = sum - price;
				System.out.println("Here is you change " + remainder+ " dollars");
				break;
			} else {
				System.out.println("You got the right amount");
			}
		} while (price != sum);
		System.out.println("Thank you for shoping");

	}
}
