package HomeWork;

public class NestedForLoopChar {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * Expected output:
		 * 
		 * $$$$
		 * $  $
		 * $  $
		 * $$$$
		 *
		 */

		for (int i = 1; i <= 2; i++) {
			System.out.print("$$$$\n");
			if (i > 1) {
				break;
			}
			for (int j = 1; j <= 2; j++) {
				System.out.print("$  $\n");
			}
		}
	}

}
