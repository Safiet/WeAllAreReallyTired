package HomeWork;

public class PatternsHW {

	public static void main(String[] args) {
		//Student: Safiet Dzhemaliadinov
		System.out.println("------------HomeWork1-----------");
		/* 
		 * 1)Please print:
		 * 
		 * 55555
         * 44444
         * 33333
         * 22222
         * 11111 
		 * 
		 */
		for (int r = 5; r >= 1; r--) {
			for (int c = 5; c >=1; c--) {
				System.out.print(r);
			}
			System.out.println();
		}System.out.println("------------HomeWork2-----------");
			
		/*2) Please print
		 * 
		 * 7654321
         * 7654321
         * 7654321
         * 7654321
         * 7654321
		 * 
		 */
		
		for(int r=5; r>=1; r--) {
			for (int c=7;c>=1; c--) {
				System.out.print(c);
			}System.out.println();
		}
	}
}