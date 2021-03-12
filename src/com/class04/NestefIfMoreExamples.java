package com.class04;

public class NestefIfMoreExamples {

	public static void main(String[] args) {
		System.out.println("__________________________________________Example 3________________________________________________");
        
        //if it is friday ---->got to the movie, otherwise stay at home and study
        //            if it is friday then I will check if day is 13 ---> if yes---> watch scary movie 
                //       if no ---> watch any movie you like
		
		boolean isFriday =true;
		int day =13;
		
		if(isFriday) {
			System.out.println("Go to the movie");
		
		if (day==13) {
			System.out.println("I will watch a scary movie");
		}else {
			System.out.println("I watch any available movie");
		}
		}	else {
			System.out.println("I will stay at home and study Java");
		}
		System.out.println("-----------------------------Example2----------------------------------");

	/* 
	 * check assignment and based on the score we display a message
	 *  
	 */
		boolean completed=true;
				int score=65;
				
				if(completed) {
					if(score>90) {
						System.out.println("Great Job");
					}else if (score>80) {
						System.out.println("Good Job");
					}else if (score>70) {
						System.out.println("Good , but lets try to do better");
					}else {
						System.out.println("Good for trying, but study more!!!");
					}
					
					
				}else {
					System.out.println("Please make sure to complete all assignments on time");
				}
	
	
	
	}
}



