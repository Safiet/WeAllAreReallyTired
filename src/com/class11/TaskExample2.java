package com.class11;

public class TaskExample2 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list.
         * Inside you should have an array of veggies, fruits, dairy and sweets.
         * Retrieve all values from that array using 2 different loops
		 */

		String[][] groceryList= 
				{ {"Cucumber","Carrot","Cauliflower","Oakra"},{
					"Apple","Banana","Orange","Mango","Peach","Strawberry"},{"Milk","yogurt","Cream"},
						{"Laddu","Peda"}
			};
				
				
				for(int i=0;i<groceryList.length;i++) {
					for(int j=0;j<groceryList[i].length;j++) {
						System.out.print(groceryList[i][j] +" ");
					}
					System.out.println();
				}
				System.out.println("________________Another Way______________Forloop________");
				
				for(String []name1:groceryList) {
					for(String name:name1) {
						System.out.print(name + " ");
					}
					System.out.println();
				}}
				
				}