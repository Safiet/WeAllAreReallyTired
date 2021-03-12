package com.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your quiz score");	
	 int quiz=scan.nextInt();
	 System.out.println("Please enter your midTerm score");
		int midTerm=scan.nextInt();
	System.out.println("Please enter your Final score");
		int FinalScore=scan.nextInt();
		String Grade;
		
		int	 score=(quiz+midTerm+FinalScore)/3;
		 
		
		if (score>=90) {
			 Grade="A";
		 }else if (score >= 70 && score <90) 
		 {
			 Grade="B";
			 		
		 }else if (score >= 50 && score <70) 
		 {
			 Grade="C";
		
		 } else if (score <50) {
		 Grade="F";}
		 else {
			 Grade="D";
	 
	 }
		 System.out.println("Your grade is " +Grade);
		 if ( Grade=="A" || Grade =="B") {
			 System.out.println("I am happy!!!");
		 }
}}
