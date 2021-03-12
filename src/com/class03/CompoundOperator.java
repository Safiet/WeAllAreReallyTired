package com.class03;

public class CompoundOperator {

	public static void main(String[] args) {

		int num = 100;
		num = num + 100;
		System.out.println(num);

		num = num - 50;
		System.out.println(num);
		System.out.println("-----------------------------------------------");

		int num1 = 100;
		num1 += 100; // num1=num1+100;
		System.out.println(num1);

		num1 -= 50;
		System.out.println(num1); // num1=num1-50;

		num1 /= 5;
		System.out.println(num1); // num1=num1/5;

		num1 *= 10;
		System.out.println(num1); // num1=num1*5;
		
		num1+=20;
		System.out.println(num1);
		
		int a=1;
		a+=10;
		System.out.println(a);
		
		int lol=0;
		lol+=500;
		int b=0;
		b-=67;
		
		int cakePiece=11;
		cakePiece/=4;
		
		System.out.println(cakePiece);
		int cake=25;
		cake%=7;
		
		System.out.println(cake);
		
		double newNum=10;
		newNum=newNum/3;
		
		System.out.println(newNum);
		
		
		

	}

}
