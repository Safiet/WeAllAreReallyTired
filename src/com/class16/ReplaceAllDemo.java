package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
	
	String var1="Syntax is best34343. Batch nine is great";
	System.out.println(var1.replaceAll("[0-9]", "")); // removing the numbers
	
	var1="974563463435kzdfzdfnbsASFASFGZx";
	System.out.println(var1.replaceAll("[a-zA-Z]", "")); // removing letters upper and lower
	
	var1="23485238957sdgdfOJOIASJFO@%#*(#%#((_@#(*&#$";
	System.out.println(var1.replaceAll("[^A-Z]", "")); // remove all characters

	}

}
