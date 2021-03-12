package com.class07;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for (int i=1;i<=100; i++){
	   System.out.print(i+" ");
   }System.out.println();
		System.out.println("----------------2-------------");
		for(int b=100; b>=1;b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("----------------3---------------");
		
		for (int c=20; c>=1;c-=2) {
			System.out.print(c+ " ");
		}System.out.println();
		
		
		System.out.println("----------------4---------------");
		for (int d=21; d<=50;d+=2) {
			System.out.print(d+ " ");
		
	}System.out.println();
	System.out.println("----------------2(even)-------------");
	for(int z=20; z>=1; z-=2) {
		if (z%2==0) {
			System.out.print(z+ " ");	
		}
	}System.out.println();
System.out.println("What is the ouptut");
	int sum=0;
		for(int i=1;i<=5; i++) {
			sum=sum+i;
		}	System.out.println(sum);
		System.out.println(" -------------------What is the otput-------------");
		int result =0;
		for(int i=2;i<10;i+=2) {
			result+=i;
			}System.out.println(result);
		}
		
	/*
	 * calculate sum of odd and even numbers from 1 to 50*
	 */
		
}