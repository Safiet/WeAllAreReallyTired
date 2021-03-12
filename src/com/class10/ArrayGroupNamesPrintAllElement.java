package com.class10;

public class ArrayGroupNamesPrintAllElement {

	public static void main(String[] args) {
		/* 
		 * Student Safiet;
		 * 
		 * Create an array of names and store all names of your group.
		 *  Then print your name from that array.
		 *   (use 2 different ways of creating an array).
		 */

		String[] names=new String[9];
		names[0]="Safiet";
		names[1]="Darina";
		names[2]="Mirage";
		names[3]="Yulia";
		names[4]="Zhanna";
		names[5]="Kenza";
		names[6]="Aisha";
		names[7]="Aryan";
		names[8]="Yara";
		
		System.out.println(names[0]);
		
		
		System.out.println("----------------Another way-----------");
		
		String[] names1= {"Safiet","Darina","Mirag","Yulia","Zhanna","Kenza","Aisha","Aryan","Yara"};
		System.out.println(names1[1]);
	
	System.out.println("--------------Another way how to print all elements-----------");
	
	 for(int i=0;i<names.length; i++) {
		 System.out.println(names[i]);
	 }
	}
	

}
