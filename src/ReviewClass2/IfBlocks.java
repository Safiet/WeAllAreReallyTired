package ReviewClass2;

public class IfBlocks {

	public static void main(String[] args) {
		int number1=10;
		/*
		 * if (number1 % 5 == 0) { System.out.println("Number is divisible by 5"); if
		 * (number1 % 2 == 0) { System.out.println("Number is divisible by 2"); } if
		 * (number1 % 10 == 0) { System.out.println("Number is divisible by 10"); }
		 * 
		 * }
		 */
	// If a number is divisible by 2 5 and 10 3lines should be printed if it is divisible obnly by 5 10 two lines should be printed and if its divisible by 10 one line should print
	
		
		// use "if" to specify a block of code to be executed, if a specified condition is true
		// Use "else" to specify a block of code to be executed, if the same condition is false
		// Use "else" if to specify a new condition to test, if the first condition is false
	if (number1%5==0) {
		System.out.println("Number is divisible by 5");
		}else {
			if (number1%2 == 0)
			{
				System.out.println("Number is divisible by 2");
			}
		}
}
}