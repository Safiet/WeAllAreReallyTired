package com.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner pp = new Scanner(System.in);

		System.out.println("Please enter Month of birth");
		String birthMonth, season;
		birthMonth = pp.nextLine();

		if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
			season = "Winter";
		}else 	if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {
			season = "Spring";
		}else 	if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
			season = "Summer";
		}else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
			season = "Autumn";
		} else {
			season="Invalid";
		}
		System.out.println("You were born in " + season);

	}

}
