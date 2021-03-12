package HomeWork;

import java.util.Scanner;

public class HomeWorkTask3_2 {

	public static void main(String[] args) {
		/*
		 *  Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *  At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner scan;
		String explanation;
		char grade;
		scan=new Scanner(System.in);
		System.out.println("PLease enter your grade (use only Upper Letter)");
		grade=scan.next().charAt(0);
		 
		switch (grade) {
		case 'A':
			explanation="an Excelent";
			break;
		case 'B':
			explanation="a Good";
			break;
		case 'C':
			explanation="an Average";
			break;
		case 'D':
			explanation="a Bad";
			break;
		default:
			explanation="Not Acceptable";
			
		}
			System.out.println("The user entered "+ grade + " grade! The user has "+ explanation + " result!");
		
		}
		
		
	}


