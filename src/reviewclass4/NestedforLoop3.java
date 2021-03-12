package reviewclass4;

public class NestedforLoop3 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i = i + 2) {
			System.out.println("i");

			/*
			 * when we entering the loop these two statements will executed in j=0;i<5;
			 * after that all of the code inside the loop will be executed and then j=j-i
			 * and the condition will be checked i<5 ;after that j=j-i i<5 j=j-1 i<5
			 * 
			 */

			for (int j = 0; i < 5; j = j - i) {

				System.out.println(i + "  " + j);
				i++;
			}
			System.out.println("i");
		}
	}
}
