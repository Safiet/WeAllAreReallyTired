package com.class09;

public class PatternExamples {

	public static void main(String[] args) {
	/*  print please incremented column:
	 *  
     *  1 2 3 4 5 
     *  1 2 3 4 5 
     *  1 2 3 4 5 
     *  1 2 3 4 5 
	 */
	
		for(int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
				System.out.println();

	}
	System.out.println("-----------------------------2 example decremented column------------------------");
	/*
	 *  print please:
	 *  6 5 4 3 2 1 
     *  6 5 4 3 2 1 
     *  6 5 4 3 2 1  
     *  6 5 4 3 2 1  
	 */
	
		for(int r=1; r<=4; r++) {
		for (int c=6; c>=1; c--) {
			System.out.print(c+" ");
		}
			System.out.println();
	
	}
		System.out.println("-----------------------------2 example another way------------------------");
		/*
		 *  print please:
		 *  6 5 4 3 2 1 
	     *  6 5 4 3 2 1 
	     *  6 5 4 3 2 1  
	     *  6 5 4 3 2 1  
		 */
		
			for(int r=5; r>=2; r--) {
			for (int c=6; c>=1; c--) {
				System.out.print(c+" ");
			}
				System.out.println();
		
		}
			System.out.println("-----------------------------3 example------------------------");
			/*
			 *  print please:
			 *  11111 
		     *  22222  
		     *  33333  
		     *  44444
		     *  55555  
			 */
			
				for(int r=1; r<=5; r++) {
				for (int c=5; c>=1; c--) {
					System.out.print(r);
				}
					System.out.println();
				}	System.out.println("-----------------------------4 example------------------------");
				/* print please:
				 * 
				 *  * 
                 *  * * 
                 *  * * * 
                 *  * * * * 
                 *  * * * * * 
                 *  
				 */
				
				for(int r=1;r<=5;r++) {
					for(int c=1; c<=r;c++) {
						System.out.print("* ");
					}System.out.println();
				
			}

				
				}}
