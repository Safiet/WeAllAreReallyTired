package HomeWork;

public class Task4_6_2021 {

	public static void main(String[] args) {
		/*
		 * /* 4.Create 2D array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries have been stored.
		 */
		String[][] countries = { { "Dominican Republic", "Canada", "Cuba", "Mexico" },
				{ "Brazil", "Argentina", "Colombia", "Peru", "Chile" },
				{ "Great Britain", "Italy", "Monaco", "France" }, { "Nigeria", "Ghana", "Kenya", "Tanzania" } };
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.println(countries[row][col] + " ");
			}
			System.out.println("-------------------");
		}
		System.out.println("============   Nested For Each Loop  =============");
		for (String[] names : countries) {
			for (String n : names) {
				System.out.print(n + " ");
			}
			System.out.println();

		}
		int number = countries.length + countries[1].length + countries[2].length + countries[3].length;
		System.out.println("In this array were stored " + number + " countries.");

	}
}
