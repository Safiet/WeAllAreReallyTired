package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		int time=7;
		if(time<12) {
			System.out.println("Hello");//code executes 1 time
		}
		System.out.println("__________________________WHILE LOOP__________________________");
				
		while (time<12) {
			System.out.println("Hello"); // core runs forever
			time++;
		}
	 System.out.println("_______________________print numbers from 1-10_____________________");
	
	 int num=1;
	 while(num<=10) {
		 System.out.print(num);
	 num++;
	 }
	System.out.println();
	 System.out.println("_______________________print numbers from 20-40_____________________");
	
	 num=20;
	 while(num<=40) {
		 System.out.print(num);
	 num++;	
	}
	 System.out.println();
	 System.out.println("_______________________print numbers from 10-1_____________________");
			 
	 int a=10;
	 while(a>=1) {
		 System.out.print (a+" ");
		 a--;
	 }
	 
	}}