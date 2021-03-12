package com.class11;

public class PrintAllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				
				{"Alexandria","Oakton","Arlington","Virginia Beach","FairFax"},
				{"Philly","Strassburg","Pittsburgh"},
				{"Boston","Quincy","Springfield","Burlington"},
				{"Los Angeles", "Long beach","San Francisco", "Sacramento","Santa Barbara"},
				{"Miami","Orlnado","Tampa","Tallahasee" }
				
		};
				
		System.out.println(usa.length); // 5 total single arrays / 5 rows total
		
	System.out.println(usa[0].length); // 5 elements inside 1 array /5 columns in 1 raw
	System.out.println(usa[1].length); // 3 elements inside 2 array / 3 columns in 2 raw
	System.out.println(usa[2].length); // 4 elements inside 3 array / 4 columns in 3 raw
	System.out.println(usa[3].length); // 5 elements inside 4 array / 5 columns in 4 raw
	System.out.println(usa[4].length); // 4 elements inside 5 array / 4 columns in 5 raw
	
	 for(int r=0; r<usa.length;r++) {  // iterates over rows
		 for(int c=0; c<usa[r].length;c++) {
			 System.out.print (usa[r][c]+", ");
		 }System.out.println();
	 }
	 
	 System.out.println();
	 System.out.println(" using nested for each loop------------------------");
	 System.out.println();
	
	 for(String[] cities:usa) {
			for(String city:cities) {
				System.out.print(city+", ");
			}System.out.println();
		}
	
		}

	}


