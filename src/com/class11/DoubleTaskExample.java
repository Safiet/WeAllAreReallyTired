package com.class11;

import java.util.Scanner;

public class DoubleTaskExample {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner
		 * calculate the sum of all stored elements in that array
		 */
		
		Scanner scan=new Scanner(System.in);
		double array1;
		double[] array;
		double sum=0;
		System.out.println("Please enter How many Double Elements you want to store?");
		int size=scan.nextInt();
		array=new double[size];
		
		for(int j=0; j<size;j++) {
			System.out.println("Please enter Double Elements");
			array1=scan.nextDouble();
			sum+=array1;
			
		}		System.out.println("The sum of all Elements is "+sum);
		
		
		System.out.println("------------Calculating the sum using for each loop---------------");
		for(double w:array) {
			sum+=w;
			
		}System.out.println("The sum of all Elements is "+sum);
	}

}
