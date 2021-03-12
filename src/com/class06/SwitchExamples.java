package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 *      if M ---> male
		 *      if F--->Female
		 *      otherwise---> not sure
		 * 
		 */

		
		char gender='F';
		String description;
		switch (gender) {
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
			default:
				description="N/A";
				
		}System.out.println(description);
		
		/*
		 * LIMITATION:
		 * switch CANNOT use Relational or Logical Operators( it simply check value)
		 * switch can work only with byte, short, chair, int and String
		 * Switch Cannot work with boolean,float,double,long
		 * 
		 */
		
	}

}
