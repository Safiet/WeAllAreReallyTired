package com.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, c, largest;
		System.out.println("Please enter first number ");
		a = scan.nextInt();
		System.out.println("Please enter second number ");
		b = scan.nextInt();
		System.out.println("Please enter third number ");
		c = scan.nextInt();
		if (a == b && b == c) {
			System.out.println("Number are equal");
		} else {
			if (a > b) {
				if (a > c) {
					largest = a;
				} else {
					largest = c;
				}
			} else {
				if (b > c) {
					largest = b;
				}

				else {
					largest = c;

				}
			}
			
			System.out.println("The largest number among " + a + "," + b + "," + c + ", is " + largest);
		}}
	}
