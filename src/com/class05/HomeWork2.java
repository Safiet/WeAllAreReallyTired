package com.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);	
   
    double a,b,c,largest;
		System.out.println("Please enter first number ");
		a=scan.nextDouble();
		System.out.println("Please enter second number ");
		b=scan.nextDouble();
		System.out.println("Please enter third number ");
		c=scan.nextDouble();
      
		if (a>b &&  a>c) {
			largest=a;
		}else if(b>a && b>c) {
			largest=b;
		}else if (c>a && c>b) {
			largest=c;
		}else { largest=0;
			System.out.println("Try again");
		}
		System.out.println("The largest number will be "+largest);
	}

}
