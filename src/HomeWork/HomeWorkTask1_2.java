package HomeWork;

import java.util.Scanner;

public class HomeWorkTask1_2 {

	public static void main(String[] args) {
		
		Scanner dmv=new Scanner(System.in);
		System.out.println("Hello what is you age?");
		System.out.print("My age is ");
		
		int age=dmv.nextInt();
		
		if (age>=18) {
			System.out.println("Congratulations!");
			System.out.println("We will issue you a driver license!");
			}else {
				System.out.println("Sorry we cant give you a driver license but.");
				System.out.println("We can offer you to get a learners permit");
			} 

	}

}
