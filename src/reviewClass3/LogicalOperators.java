package reviewClass3;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * loogical operators are used to combine miltiple conditions in the same if block
		 */
		String day="Sunday";
		if("Sunday".equals(day)) {
			System.out.println("Relax its weekend dont blink otherwise its over");
		}else if (day.equals("Saturday")) {
			System.out.println("Relax its weekend dont blink otherwise its over");
		}else {
			System.out.println("I have to go to work");
		}
		
	if ("Sunday".equals(day) || day.equals("Saturday")) {
	System.out.println("Relax its weekend dont blink otherwise its over");
	}else {
		System.out.println("I have to go to work");}
	}
		
	}