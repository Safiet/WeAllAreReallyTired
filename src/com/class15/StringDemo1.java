package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="Azizi"; //Mostly used because of shorter syntax
		String name1=new String("Azizi");
		
		System.out.println(name);
		//Length=> number of character in String object
		System.out.println(name.length());
		name="            Azizi";
		int len=name.length();
		System.out.println(len);
		// 
		
		

	}

}
