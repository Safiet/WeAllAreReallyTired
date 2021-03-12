package ReviewClass2;

public class ProperExample {

	public static void main(String[] args) {

		String userName = "Salma";
		String password = "Salma123";
		double accountBalance = 1000;
		double amountToTransfer = 200;

		if (userName.equals("Salma")) {
			if (password.equals("Salma123")) {
				System.out.println("Welcome to Bank of Syntax");
				if (accountBalance >= amountToTransfer) {
					System.out.println("Amount transffered");
				} else {
					System.out.println("Insufficient balance");
				}
			} else {
				System.out.println("Your password is not valid");
			}

		} else {
			System.out.println("your username is not valid");
		}
	}

}
