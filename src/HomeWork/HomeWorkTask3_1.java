package HomeWork;

import java.util.Scanner;

public class HomeWorkTask3_1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it.
		 *  Once values are capture print which language user speaks.
		 */
		Scanner scan;
		String country, language;
		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country.toLowerCase()) {
		case "usa":
			language = "English";
			break;
		case "russia":
			language = "Russian";
			break;
		case "ukraine":
			language = "Ukrainian";
			break;
		case "poland":
			language = "Poland";
			break;
		case "kazakhstan":
			language = "Kazakh";
			break;
		case "italy":
			language = "Italian";
			break;
		case "german":
			language = "German";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("User speaks " + language+ " language!");

	}

}
