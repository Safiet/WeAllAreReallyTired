package HomeWork;

public class Task1_62021 {
	public static void main (String[] args) {
	/*
	 * PART 1 - Coding
	 * 
	 * 1.Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
	 * Print the sum of all numbers. 
	 */
	int[][] numbers = {
			{7,8,9},
			{1,2,3},
			{101,108,202}
	};
	     int sum=0;
	     
	for (int i = 0; i <numbers.length; i++) {
		for(int j=0; j<numbers[i].length;j++) {
		sum+=numbers[i][j];
		}
		
	}System.out.println("The sum of all the numbers is "+ sum);
	System.out.println();

}}
