package HomeWork;

public class HomeWorkTask4_1 {

	public static void main(String[] args) {

		int sumEven = 0, sumOdd = 0;
		for (int p = 0; p <= 50; p += 2) {
			sumEven += p;
		}
		System.out.print("Sum even numbers " + sumEven);

		for (int p = 1; p <= 50; p += 2) {
			sumOdd += p;
		}
		System.out.println();

		System.out.println("Sum odd number " + sumOdd);
		System.out.println();
		System.out.println("The total sum of add and even number " + (sumEven + sumOdd));

		System.out.println("-------------------------------2 way to do it-------------------------------");
		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}}
			System.out.print("Sum even numbers " + even);
		
		System.out.println();

		System.out.println("Sum odd number " + odd);
		System.out.println();
		System.out.println("The total sum of add and even number " + (even + odd));
	}
	
	
}
