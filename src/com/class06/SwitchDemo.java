package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		//
		int day = 5;
		String weekDay;

		if (day == 1) { // work with conditions
			weekDay = "Today is Monday";
		} else if (day == 2) {
			weekDay = "Today is Tuesday";
		} else if (day == 3) {
			weekDay = "Today is Wednesday";
		} else if (day == 4) {
			weekDay = "Today is Thursday";
		} else if (day == 5) {
			weekDay = "Today is Friday";
		} else if (day == 6) {
			weekDay = "Today is Saturday";
		} else if (day == 7) {
			weekDay = "Today is Sunday";
		} else {
			weekDay = "This date is invalid day";
		}
		if (!weekDay.equals("Invalid")) {
			System.out.println(weekDay);
		}
		System.out.println(
				"--------------------------------------------------using switch---------------------------------");
		String weekDay1;

		switch (day) { // is a value based (its jump right away to matching case)
		
		
		// we CANNOT have a duplicate cases
		//values NUST match a variable type
		//we MUST have a break in every case;
		
		
		case 1:
			weekDay1 = "Today is Monday";
			break;
		case 2:
			weekDay1 = "Today is Tuesday";
			break;
		case 3:
			weekDay1 = "Today is Wednesday";
			break;
		case 4:
			weekDay1 = "Today is Thursday";
			break;
		case 5:
			weekDay1 = "Today is Friday";
			break;
		case 6:
			weekDay1 = "Today is Saturday";
			break;
		case 7:
			weekDay1 = "Today is Sunday";
			break;

		default:
			weekDay1 = "Invalid";
			break;

		}
		if (!weekDay.equals("Invalid")) {

		}
		System.out.println(weekDay1);
		
		
		boolean sunny=true; 
		if (sunny) {
			System.out.println("I am happy");
		}
		/*switch can work only with byte, short, chair, int and String
		 * Switch Cannot work with boolean,float,double,long
		 * 
		 * 
		 *  switch (sunny) ---> CANNOT work with boolean because boolean have only two variables(true,false)
		 *  
		 */
		
		
		double price=10.99; 
				if (price>10) {			System.out.println("Too expansive");
				}
				//switch(price) ---> CanNot work with double because too big numbers and will be too many variables.
	}

}
