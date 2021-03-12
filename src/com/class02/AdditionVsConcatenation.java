package com.class02;

public class AdditionVsConcatenation {

	public static void main(String[] args) {


		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2); //21HelloHi
		
		System.out.println(num1+str1+num2+str2); //10Hello11Hi
		
		System.out.println(str1+str2+num1+num2); //HelloHi1011 if the numbers after string they will not be sum it will just attach

		
		String result=str1+str2+(num1+num2);
		System.out.println(result);
	}

}
