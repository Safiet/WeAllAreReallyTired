package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * we play lottery and we have a win number which is 17
		 * we need to keeps asking a user to enter any number from 1 to 100
		 * until correct number is entered
		 */
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		input=new Scanner(System.in);
        
		
		do {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}while (num==lotteryNumber);
		}
	}


