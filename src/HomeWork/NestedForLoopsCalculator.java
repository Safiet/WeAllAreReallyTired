package HomeWork;

public class NestedForLoopsCalculator {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 2 4 6 8 10 12 14 16 18 20
		 * 
		 * 3 6 9 12 15 18 21 24 27 30
		 * 
		 * 4 8 12 16 20 24 28 32 36 40
		 * 
		 * 5 10 15 20 25 30 35 40 45 50
		 */

		int a = 10;
		int b = 1;
		int c;
		for (c = 1; c <= b; c++) { // this loop is used to print the lines by vertical

			for (b = 1; b <= 10; b++) { // this loop is used to print lines by horizontal
				System.out.print(b * c + " ");
			}
			if (c > 4) {
				break;
			}
			System.out.println("");
		}
	}

}
