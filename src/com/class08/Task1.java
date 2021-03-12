package com.class08;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */
		System.out.println("--------------------------------------Task 1.1-----------------");
		System.out.println();
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) { // ---------------------------------->>>>>>>> except divisible by 3 !!!!
				continue;
			}
			System.out.print(i + " ");

		}

	}
}
