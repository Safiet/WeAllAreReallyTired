package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("--------------------------------------Task 1.2 -----------------");

		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 */

		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println(" Do you want apply for a credit card?");
			answer = scan.nextLine();
		} while (!answer.equalsIgnoreCase("yes"));

		System.out.println("Thanks");

	}
}