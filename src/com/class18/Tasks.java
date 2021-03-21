package com.class18;

public class Tasks {
	/*
	 * Create a method that will accept an array as parameters
	 *  and will return a sum of all elements from that array.
	 * Method should be visibly only within same package 
	 * and accessible by the creating an instance of the class. 
	 */
	int sum=0;
	 double sumArray(double [] arr) {
	   for(double i: arr) {
	sum+=i;
 }
   return sum;
   }
   
   /*
    * Create a method that will take a String as a parameter and returns reversed String.
    *  Method should be available to all classes within your project and accessible by class name.
    */
   
   
   public static String reverse(String bar) {
	   String s="";
	   for (int i=bar.length()-1;i>=0;i--) {
		   s+=bar.charAt(i);
	   }return s; 
   }
   
   /*
    * Create a method that will accept a String as a parameter and return 
    * a new String that consist only of vowels.
    *  Method should be available inside the class 
    *  only where it was declared and executed by calling it is name.
    */
    
   private static String vowelsOnly(String input) {
	return input.replaceAll("[^a,e,i,o,u]", "");}
	public static void main(String[] args) {
		System.out.println(vowelsOnly("asghar"));

		
	}
   
	
		}
