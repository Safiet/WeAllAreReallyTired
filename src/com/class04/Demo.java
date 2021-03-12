package com.class04;

import java.util.Scanner;  // SHORT CUT FOR IMPORT IT WILL BE CNTRL+SHIFT+O 

public class Demo {

	public static void main(String[] args) {
		int i = 10;
		String str = "Hello";

		Scanner scan = new Scanner(System.in);   // creating scanner
		
		System.out.println("Please enter Last Name");
		
        String text=scan.nextLine(); //scan.nextLine(); ---> capture your input from console, 
                                          // once you enter text you must HIT ENTER
        
        System.out.println("My Last name is " + text);
        
        System.out.println("Please enter your name ");
        String name=scan.next(); //captures 1 word till space 
        
        System.out.println("Nice to meet you " + name);
        System.out.println("Please enter your age");
        
        int age= scan.nextInt();
        System.out.println("My name is " +text+" "+ name+ " and I am "+ age+ " years old!");
	}

}
