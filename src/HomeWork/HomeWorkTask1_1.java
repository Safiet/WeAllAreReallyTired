package HomeWork;

import java.util.Scanner;

public class HomeWorkTask1_1 {

	public static void main(String[] args) {
		
		Scanner loan=new Scanner(System.in);
		System.out.println("Hello What is the amount loan you need?");
		System.out.print("I need " );

		int ammount=loan.nextInt();
				
		if (ammount<=200000) {
			System.out.println("We will lend you money");
		}else {
			System.out.println("Sorry we have to reject the loan");
		}

	}

} 
