package com.class10;

public class AllElemnetsUsingAdvancedForLoop {

	public static void main(String[] args) {
		int[] numbers = { 10, 14, 78, 5, 90, 76, 1, 8 };

		// for each, enhanced for loop, advanced for loop

		for (int num : numbers) {
			System.out.print(num + " ");

		}
		System.out.println();
		System.out.println("----------------string-----------");
		String[] names1 = { "Safiet", "Darina", "Mirag", "Yulia", "Zhanna", "Kenza", "Aisha", "Aryan", "Yara" };

		for (int i = 0; i < names1.length; i++) {              // regular loop can work any directions 

			System.out.print(names1[i] + " ");
		}
		System.out.println();
		System.out.println("-----------string example 2----------------");

		for (String n : names1) {              // enhanced loop can work only with one direction start with the begining and finish at the end
			System.out.print(n + " ");

		}
		System.out.println();
		System.out.println("------------char---------------");

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		for (char grade : grades) {

			System.out.print(grade + " ");
		}
		System.out.println();
		System.out.println("------------boolean---------------");

		boolean[] boo = { true, false, false, false, true };
		for (boolean a : boo) {
			System.out.print(a + " ");
		}
	}

}
