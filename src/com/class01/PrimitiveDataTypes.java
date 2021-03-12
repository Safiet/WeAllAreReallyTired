package com.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 * byte-datatype--> WHAT KIND OF VALUES WE ARE GOING TO STORE
		 * BOX1- name of the variable---> label of the box
		 * 10- value that we assign to that variable-->values that we put inside the box
		 * 
		 */
		 
		
		//we are storing whole number values
		byte box1=127;     // Range : -128 till 127
		
		short box2=32767; //Range :  -32768 till 32767 
		
		int box3=2147483647; //Range :  -2147486348 till 2147483647 (Most use)
		
		long box4=1234567891012345678l; //Range : - until 18 numbers but make sure u put L or l at the end
		
		// we are storing floating numbers
		float f=12.99F; // Range up to 5-6 places of accuracy 
		double d=12.95; // Range up to 14-15 places of accuracy (most use)
		
		
		//we are storing single character values
		char a='*';
		char b='A';
		char c='1';
		
		// to store boolean values
		
		boolean variable1=true;
		boolean variable2=false;
		
		// I would like to store value 99
		
		int number=99;
		
		System.out.println(d); //12.95
		System.out.println(a); //*
		
		//System.out.print(bool); --> // Programm gives a problem because variable bool is not created at the current  moment its always have to be before system out.
		//boolean bool=true;
		
		System.out.println(variable1);  // True
		System.out.println("variable1"); // with " " its always gonna run like a name or text but if you have to pull up something so dont use any brackets

	}

}
