package com.class06;

import java.util.Scanner;

public class Exmple2 {

	public static void main(String[] args) {
		/*
		 * we need to calculate final price after the discount
		 * 
		 * we check if there is sale if no sale-->I am not going for shopping if there
		 * is sale we will ask the item we will ask price
		 * 
		 * if price is less than 10 dollars ---> apply 5%discount 
		 * if price is between 10-100 --->apply 10% discount 
		 * if price is between 100 to 500--->20% discount
		 * if price more then 500 --->30% discount
		 *  
		 * "which item your purchased , what was original price, what discount applies and final price"
		 */

		String sale = "Yes";
		Scanner s = new Scanner(System.in);
		String item;
		double price;
		double discount = 0;
		double finalPrice = 0;
		System.out.println("Do you have a sale?");
		sale = s.nextLine();
		if (!sale.equalsIgnoreCase("yes")) {
			System.out.println("I am not going for shopping");
		} else {
			System.out.println("What is the item on sale?");
			item = s.next();
			System.out.println("What is the price of the item?");
			price = s.nextDouble();
			if (price>0 && price<10) {
				discount = price * 0.05;
			} else if (price >= 10 && price < 100) {
				discount = price * 0.1;
			} else if (price >= 100 && price <= 500) {
				discount = price * 0.2;
			} else if (price > 500) {
				discount = price * 0.3;
			}
			finalPrice = price - discount;
			System.out.println("You purchased the " + item + " the original price was " + price
					+ ", and we applied discount " + discount + " and you have final price of " + finalPrice);
		if(finalPrice<500) {
			System.out.println("I did not do crazy shopping");
		}
		
		}

	}
}
