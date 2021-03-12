package com.class11;

public class TasksExample {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */

		String [][] cars= {
			{"Buick","Ford","Chevrolet"},
			{"Mercedes","BMW"},
			{"Reanult","KIA","Huyndai"},
			{"Ferrari","Maserati","AlfaRomeo"},
		};
		for(String[] models:cars) {
			for(String model:models) {
				System.out.print(model+ ", ");
			}System.out.println();
		
		}	System.out.println("-----------------2 loop--------------");
		
		for(int a=0;a<cars.length; a++) {
			for(int b=0;b<cars[a].length;b++) {
			System.out.print(cars[a][b]+", ");
		}
			System.out.println();
		}
		
		}
}
