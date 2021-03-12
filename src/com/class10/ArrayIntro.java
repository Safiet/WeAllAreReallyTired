package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int num = 10;
		num = 20;
		System.out.println(num);
		System.out.println("-----------------------------Int----------------------------------");

		int[] array = new int[5]; // craeting a box with 5 numbers

		array[0] = 10; // index for that box (numbers);
		array[1] = 12; 
		array[2] = 15;
		array[3] = 9;
		array[4] = 13;

		System.out.println(array[0] + array[4]);

		System.out.println("-------------------------------Double------------------------------------");

		double[] numbers = new double[2];
		numbers[0] = 10.99;
		numbers[1] = 19.01;

		numbers[0] = 11.99;
		System.out.println(numbers[0]);

		System.out.println("--------------------------------String-----------------------------------");

		String[] names = new String[4];
		names[0] = "Safiet";
		names[1] = "Alona";
		names[2] = "Edem";
		names[3] = "Evelina";
		System.out.println(names[2]);

		System.out.println("--------------------------------Default otput-----------------------------------");

		int[] nums = new int[3];
		System.out.println(nums[1]);  // output will be default int number=0;

		System.out.println("--------------------------------Boolean -----------------------------------");
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		System.out.println(b[2]);
		
		int size=b. length;
		System.out.println("size of an array is "+size);

		
	}

}
