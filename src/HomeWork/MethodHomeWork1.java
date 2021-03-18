package HomeWork;

public class MethodHomeWork1 {
/*
 *Create a method that will say Hello in different language 
 *based on the country that will passed when method is executed. 	
 */
	String hw1(String country) {
		String Hi;
		switch(country) {
		case "USA":
			Hi="Hello";
			break;
		case "Russia":
			Hi="Privet";
			break;
				default:
				Hi="Sorry i dont know what language you speak";		}
		return Hi;	}
	 /* Write a method to return
	 * whether given number is prime or not? */
	boolean Prime(double c) {
		if (c > 1) {
			for (double a = 2; a < c; a++) {
				if (c % a == 0) 
				{return false;}}}
		 else{return false;
		 }return true;}	

/* Create  class Student that will have a method getGrade.
 *  Your method should accept the score of a student and return a grade:
score > 90 - A ; score >80 - B ; score >70 - C ; score > 50 - D ; anything else - F
 */
	char getGrade(int score) {
		if(score>90) {
			return 'A';
		}else if(score>80) {
			return 'B';
		}else if(score>70) {
			return 'C';
		}else if(score>50) {
			return 'D';
		}else {
			return 'F';  	}}}
		
		
	

