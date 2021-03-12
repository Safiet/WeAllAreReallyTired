package com.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		/*
		 * student Safiet;
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is.
		 *  Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="Day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		System.out.println("-------------------Another way------------");
		
		String[] w= {"Java","Saturday","Day","coding","is"};
		System.out.println(w[1]+" "+w[4]+" "+w[0]+" "+w[3]+" "+w[2]);

}}
