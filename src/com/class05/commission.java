package com.class05;

import java.util.Scanner;

public class commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan;
		double saleAmount;
		double commission ;
		
		scan=new Scanner(System.in);
		System.out.println("PLease enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
		if(saleAmount<10) {
			System.out.println("Your daily commission is 0");
		}else if (saleAmount>=10 && saleAmount<=100) {
			System.out.println("Your daily commission is " + saleAmount*0.1);
		}else if (saleAmount>100 && saleAmount<=500) {
			System.out.println("Your daily commission is " + saleAmount*0.2);
		}else if (saleAmount>500 && saleAmount<=1000) {
			System.out.println("Your daily commission is " + saleAmount*0.3);
		}else {
			System.out.println("Your daily commission is " + saleAmount*0.5);
		}System.out.println("Your daily commision is  " ) ;
		// if commission is more then 500 --> you are an amazing seller
		
		
		if (saleAmount>500) {
			System.out.println("You are an amazing seller");
		}
		}
	}



