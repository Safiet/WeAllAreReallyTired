package HomeWork;

import java.util.Scanner;

public class HomeWorkTask2_2 {

	public static void main(String[] args) {
		Scanner job=new Scanner(System.in);
		
		System.out.println("How many years you worked with us?");
		double years=job.nextDouble();
		
				
		if (years>=5) {
			System.out.println("What was your annual salary?");
			double sallary=job.nextDouble();
			System.out.println("Congrats! You are eligible for a bonus!");
			if (sallary>50000) {
				System.out.println("Your bonus will be a 5000$");
			}else {
				System.out.println("Your bonus will be a 3000$");
			}
			
		}else {
			System.out.println("Sorry, but you are not eligible for a bonus!");
		}
		

	}

}
