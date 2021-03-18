package com.class14;

public class MoreMethodExamples {

	/*
	 * Craete a method that does not take any values and always return the string Hi
	 */
	String print(){
		return "Hi";
	}
	
	/*
	 * create a method that takes a number and returns the double of that number
	 */
	
	
	double doubleTheValue(double input) {return input*2;
	}
	
	/*
	 * create a method what will take a boolean as input and if the value is true
	 *  i want to say take the umbrella and if its false i want to print
	 *   please go for a walk  
	 */
	
	void isRaining(boolean question) {
		if(question) {System.out.println("Please take an umbrella");}
		else {
			System.out.println("Go for a walk");
		}
			
		}
	
	/*
	 * print Batch 9 5 times 
	 */
	
	void prints() {
		for(int i=0;i<5;i++) {
			System.out.println("Batch 9 is great");
		}
	
}
	/*
	 * create a method that takes 2 numbers as input and return the greater number
	 * 
	 */
	
	double returnGreater(double a, double b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	/*
	 * create amethod that takes a number if number
	 *  is even print number is even otherwise print number is odd
	 */
	
	
	void method(double num1) {
		if(num1%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}
	
	/*
	 * write a method that takes an array and returns
	 * the sum of the elements that are present in the array
	 */
	
	double returnTheArraySum(double[] arr) {
		double sum=0;
		for(double element:arr) {
			sum=sum+element;
		}return sum;
				
		
	}
	
	/*
	 * write a method that returns true if a string is a mirror of itself otherwise
	 * it returns false
	 * 
	 * aba yes
	 * bbb yes
	 * bba no 
	 * 
	 */
	 boolean Mirror(String s) {
		  for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {
		    if ( s.charAt(i) != s.charAt(j) ) {
		       return false;
		     }
		  } 
		  return true;
		}



boolean isMirror(String str) {
	String newStr="";
	for (int i=str.length()-1;i>0;i--) {System.out.println(i+" "+str.charAt(i));
	newStr+=str.charAt(i);
		}
	System.out.println(newStr);
	if(str.equals(newStr)) {
	return true;
	}else {return false;}}
	
}






