package com.class05;

import java.util.Scanner;

public class anotherExample {

	public static void main(String[] args) {
		/*we have to calculate based on sales
		 * 
		 * ask user to enter sale that he made
		 * based on sales we will calculate commission
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan;
		double saleAmount, commission;
		
		scan=new Scanner(System.in);
		System.out.println("PLease enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
		if(saleAmount<10) {
			commission=0;
		}else if (saleAmount>=10 && saleAmount<=100) {
			commission=saleAmount*0.1;
		}else if (saleAmount>100 && saleAmount<=500) {
			commission=saleAmount*0.2;
		}else if (saleAmount>500 && saleAmount<=1000) {
			commission=saleAmount*0.3;
		}else {
			commission = saleAmount *0.5;
		}System.out.println("Your daily commision is " + commission);
		// if commission is more then 500 --> you are an amazing seller
		
		if (commission>500) {
			System.out.println("You are an amazing seller");
		}
	}

}
