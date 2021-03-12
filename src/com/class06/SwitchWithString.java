package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * we need to identify favorite food
		 * we need to capture country from a user based on the country identify favorite
		 * food
		 * 
		 */
		Scanner input;
		String country, food;
        
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		case "usa":
			food="Burger";
			break;
		case "afghanistan":
			food="Kebab";
			break;
		case "vietnam":
			food="Pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case "kazakhstan":
			food="Horse";
			break;
		case "belarus":
			food="Draniki";
			break;
		case "tajikistan":
			food="Plov";
			break;
		case "mexico":
			food="Tacos";
			break;
		default:
			food="Unknown";
			}
		System.out.println("you favorite food is " +food);
	}

}
