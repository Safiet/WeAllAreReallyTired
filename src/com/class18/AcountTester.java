package com.class18;

import java.util.Scanner;

public class AcountTester {

	public static void main(String[] args) {
		Account account=new Account();
		// account.accountBalance=2335235; ---> we cant change because information private;
	Scanner scanner=new Scanner(System.in);

	while(true){
		System.out.println("Enter 1 for signup /n 2 for login /n 3 for transfer /n 4 to exit the program");
		int input=scanner.nextInt();

		if(input==4){
			break;}
		else if(input==3){
			System.out.println("Enter the ammount that you want to transfer ");
			double amount=scanner.nextDouble();
			System.out.println("PLease reenter your password");
			String pass=scanner.next();
			account.transferFunds(pass,amount);
			} if (input==2){
			System.out.println("Welcome to Our Bank please enter your UserName and Password");
			String username=scanner.next();
			String password1= scanner.next();
			account.login(username,password1);
		}else if(input==1){
			System.out.println("Enter your userName password and the amount that you want to deposit");
			account.signUp(scanner.next(),scanner.next(),scanner.nextDouble());
		}
		}
		System.out.println("Good bye");
	}


	}


