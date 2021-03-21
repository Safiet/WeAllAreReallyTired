package com.class17;

public class LocalVariablesDemo {

	
	
	void printInfo (String name) {
String phoneNumber="123456789";
	System.out.println(name);}
	
	
	void printInfoWithAddress(String name,String address) {
		System.out.println(name+address);}
	 
	
	public static void main(String[] args) {
		
		String name="Local";
		
		System.out.println(name);
		
		for(int i=0;i<5;i++) {
		System.out.println(i);
	}
		// System.out.println(i); CE not defined

		{
			int x=10;
			{int y=20;
			System.out.println(x);
			}//System.out.println(y);
			}
		}
}
