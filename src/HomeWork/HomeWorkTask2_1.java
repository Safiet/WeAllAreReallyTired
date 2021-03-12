package HomeWork;
import java.util.Scanner;
public class HomeWorkTask2_1 {
	public static void main(String[] args) {
		Scanner bank = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String respond = bank.nextLine();
		String y = "Yes";
		String b="yes";
		String c="I do";
		String d="Of course";
		String e="of course";

		if (respond.equals(y)) {{
			System.out.println("What is the balance on the card?");
			double bal = bank.nextDouble();
			  if (bal > 1000) { System.out.println("Pay the balance immediately!");
			     }else { System.out.println("You can spend more money!");
			        }}}else if (respond.equals(b)) {
			        System.out.println("What is the balance on the card?");
			           double bal = bank.nextDouble();
			             if (bal > 1000) { System.out.println("Pay the balance immediately!");
			               } else { System.out.println("You can spend more money!");
			                  }}else if (respond.equals(c)) {
				                System.out.println("What is the balance on the card?");
				                  double bal = bank.nextDouble();
				               if (bal > 1000) { System.out.println("Pay the balance immediately!");}
				            else {System.out.println("You can spend more money!");
				       }}else if (respond.equals(d)) {
				 	System.out.println("What is the balance on the card?");
				double bal = bank.nextDouble();
			if (bal > 1000) {System.out.println("Pay the balance immediately!");
		} else {System.out.println("You can spend more money!");
	}}else if (respond.equals(e)) {
  System.out.println("What is the balance on the card?");
	 double bal = bank.nextDouble();
		if (bal > 1000) {System.out.println("Pay the balance immediately!");
			} else {System.out.println("You can spend more money!");
				}}else { System.out.println("We can offer you a credit card!");}}}
