package com.class08;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */

		Scanner scan = new Scanner(System.in);
		int start;
		int end;

		System.out.println("Please provide start point");
		start = scan.nextInt();
		System.out.println("Please provide end point");
		end = scan.nextInt();

		int sumEven = 0;
		int sumOdd = 0;

		if (start < end) {
			for (int i = start; i < end; i++) {
				if (i % 2 == 0) {
					sumOdd += i;
				} else {
					sumEven += i;
				}
			}
			System.out.println("The sum of even numbers from range " + start + " to " + end + " is " + sumEven);
			System.out.println("The sum of odd numbers from range " + start + " to " + end + " is " + sumOdd);
		} else {
			System.out.println("Sorry first number have to be lees than a second number");
		}

	}
}
