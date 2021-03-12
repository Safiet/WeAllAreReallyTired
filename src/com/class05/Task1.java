package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int height;
		System.out.println("Please enter heights in inches");
		height=input.nextInt();
		if (height<60) {
			System.out.println(" You are Short");
		}else if (height==60 && height<72) {
			System.out.println(" You are medium");
		}else if(height>72) {
			System.out.println("You are tall");
		}

	}

}
