package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * I want to capture your name 5 different names and say hello to every name
		 */
		Scanner scan=new Scanner(System.in);
	    String name;
		
	    int q=5;
	    while(q<10) {
	    System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Hello "+name);
		q++;
	    		}
	    System.out.println(" Another way to do that ");
	    
	    int a=5;
	    while(a>=1) {
	    System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Hello "+name);
		a--;
	}
	    
	
	
	
	
	}

}
