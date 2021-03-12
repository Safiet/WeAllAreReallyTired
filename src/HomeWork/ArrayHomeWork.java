package HomeWork;

public class ArrayHomeWork {

	public static void main(String[] args) {
		/*
		 * student Safiet Dzhemaliadinov;
		 * 
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		System.out.println("---------------1 TASK----------");
		String[] cars = { "LEXUS", "MERCEDES", "BMW", "HONDA", "TOYOTA", "BENTLEY" };
		for (int a = 0; a < cars.length; a++) {
			System.out.print(cars[a] + " ");
		}
		System.out.println();
		System.out.println("---------------1 TASK( 2 way to print)-----------");

		for (String a : cars) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("---------------2 TASK-----------");

		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array
		 */
		String[] animals = { "BEAR", "MONKEY", "CAT", "DOG", "ALLIGATOR", "WOLF" };
		for (int b = 0; b < animals.length; b++) {
			System.out.print(animals[b] + " ");
		}
		System.out.println();
		System.out.println("---------------2 TASK( 2 way to print)-----------");

		for (String c : animals) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("---------------3 TASK-----------");

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] num = { 1, 3, 4, 5, 6, 78, 568 };

		for (int w : num) {
			System.out.print(w + " ");
		}
		System.out.println();
		int sum = 0;
		for (int s : num) {
			sum += s;

		}
		System.out.print("The sum of elements in an array is " + sum);
	}

}
