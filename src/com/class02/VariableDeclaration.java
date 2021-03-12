package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//1 way to create a variable or 1 step to create a variable
		short b=200; //create a variable and assign value
		            // declare a variable and initialized
		
		//2 way or 2 step
		int sum; // create or declare a variable
		sum=20;  // assign the value or initialized
		
		sum=30; // reassign the value
		
		/*
		 * int x;
		 * int y;
		 * int x;
		 */
		
		int x,y,z; 
		x=10;
		y=20;
		//z=30.9; ERROR: Type Mismatch, since variable can store only int type of values
		
		// I would like to change the value of x
		x=70;
		
		
		System.out.println(x);
		int num=33;
		
		// we are using a value of a different variable to initialize the variable
		int num2=num; //33;
		
		System.out.println(num2);
		
	
		

	}

}
