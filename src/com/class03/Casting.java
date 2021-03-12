package com.class03;

public class Casting {

	public static void main(String[] args) {
		//int i=10; type mismatch
		
		//widening or implicit casting
		double d=10;
		System.out.println(d);
		
		int num=10;
		
		/*
		 * Casting in JAVA:
		 * -CONVERTING DATA TYPES:
		 * 1)Primitive 
		 * 2)NonPrimitive
		 * 
		 * widering/automaticly/implicit
		 * byte
		 * narrowing
		 */
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		
		int cakePiece=11;
		cakePiece/=4;
		
		System.out.println(cakePiece);
		
		int number=12;               
		double result=number/5;
		System.out.println(result);
		
		double newNum=10;
		newNum=newNum/3;
		
		System.out.println(newNum);
		
		double num1=10+10.5;
		System.out.println(num1);
		
		int num2=10+(int)10.5;
		System.out.println(num2);
		
		/*Operators in JAVA
		 * 
		 * =assignment
		 * *,+,-,/,% -arithmentic operators
		 * 
		 * Relational operators
		 *  > , >= , < , <= , == , ! ,
		 * 
		 * 
		 * 
		 */
		
	}

}
