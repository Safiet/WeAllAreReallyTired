package HomeWork;

import java.util.Scanner;

public class HomeWorkTask1_3 {

	public static void main(String[] args) {
		
		Scanner task=new Scanner(System.in);
		
		System.out.println("What is the name of your city?");
		System.out.print("I live in ");
		
		String city=task.nextLine();
		System.out.println("What is the temperature in °F in your city? ");
		System.out.print("We have ");
		
		double tempF=task.nextDouble();
		
		double tempC=(tempF-32)/1.8;
		
		System.out.println("The temparature in the city " + city + " is " + tempC+" °C");

	}

}
