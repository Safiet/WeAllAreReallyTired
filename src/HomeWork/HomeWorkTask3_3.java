package HomeWork;

import java.util.Scanner;

public class HomeWorkTask3_3 {

	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator.
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 * Based on operator provide the result to user.
		 * 
		 */
		Scanner input=new Scanner(System.in);
		double a,b,result;
		char operation;
		System.out.println("PLease enter a first number");
		a=input.nextDouble();
		System.out.println("Please enter a second number");
		b=input.nextDouble();
		System.out.println("PLease tell us what kind of operation you want to use (+,-,*,/)");
		operation=input.next().charAt(0);
		
		switch(operation) {
		    case '+':
		    	result=a+b;
		    	break;
		    case '-':
		    	result=a-b;
		    	break;
		    case'*':
		    	result=a*b;
		    	break;
		    case '/':
		    	result=a/b;
		    	break;
		    	default:
		    		result=0;
		    		System.out.println("Invalid input");
		}System.out.println("The result is "+ a+ operation+b+"="+ result);
        
		
		
		
	}

}
