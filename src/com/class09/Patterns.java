package com.class09;

public class Patterns {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		System.out.println("----------------------2 way to do it with nested loop---------------");
 /* Print please thatL:
  * 
  * 
  *  * * * * * * * * 
  *  * * * * * * * * 
  *  * * * * * * * * 
  *  * * * * * * * * 
  *  * * * * * * * * 
  *  * * * * * * * * 
  */
		for (int r = 1; r <= 6; r++) { // rows
			for (int c = 1; c <= 8; c++) { //column
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
