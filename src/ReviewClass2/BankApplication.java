package ReviewClass2;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		String userName;
		String password;
		System.out.println("Please Enter your Username");
		Scanner scanner=new Scanner (System.in);
		userName=scanner.next();
		System.out.println("Please Enter your password");
		password=scanner.next();
		double accountBalance = 1000;
		double amountToTransfer = 200;

		if (userName.equals("Salma")) {
			if (password.equals("Salma123")) {
				System.out.println("Welcome to Bank of Syntax");
				System.out.println("How much you want to transfer?");
				amountToTransfer=scanner.nextDouble();
				if (accountBalance >= amountToTransfer) {
					System.out.println("Amount transffered");
				} else {
					System.out.println("Insufficient balance");
				}
			} else {
				System.out.println("Your password is not valid");
			}

		} else {
			System.out.println("your username is not valid");
		}
	}



	}


