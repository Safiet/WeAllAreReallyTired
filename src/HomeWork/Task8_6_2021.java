package HomeWork;

public class Task8_6_2021 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */

		int[] inputArray = { -2124, 564, 7894, 15216, 41161, 51651651,51651652 };
		int minValue = 0;
		int maxValue = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}

			// Method for getting the minimum value

			minValue = inputArray[0];
			for (int b = 0; b < inputArray.length; b++) {
				if (inputArray[b] < minValue) {
					minValue = inputArray[b];
				}
			}

		}
		System.out.println("Maximum value in the array is: " + maxValue);

		System.out.println("Minimum value in the array is: " + minValue);

	}
}
