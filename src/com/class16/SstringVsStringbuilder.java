package com.class16;

public class SstringVsStringbuilder {

	public static void main(String[] args) {
		
		
		for (int i=0; i<10000000; i++) {
			String s=new String(String.valueOf(i));
			System.out.println(s);
		}
		
		
	}

}
