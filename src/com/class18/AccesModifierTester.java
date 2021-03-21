package com.class18;

import java.util.Scanner;

public class AccesModifierTester {

	public static void main(String[] args) {
		AccesModifierDemo obj1=new AccesModifierDemo();
		//System.out.println(obj1.BankAccountPassword); private info cant be use in other class 
		System.out.println(obj1.SSNNumber);
		System.out.println(obj1.name);
		Scanner Scann= new Scanner(System.in);
		
	}

}
