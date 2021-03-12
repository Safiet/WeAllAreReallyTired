package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean morning=true;
		boolean classtoday=false;
		
		// is it morning? -----> Good morning
		           // if there is class: yes---> Hello Classmates
		          //                     otherwise ---> hello my Family 
		
		if (morning) {
			System.out.println("Let me check if I have a class today;");
			if(classtoday) {
				System.out.println("Yes baby you have a class today");
				System.out.println("Good morning my classmates!");
				
				}else {
					System.out.println("No baby you will stay with your family today!");
					System.out.println("Good morning my Family!");
				}
				}
         System.out.println("------End of the code----");
         
         System.out.println("________________________________________Example2____________________________________________");
         
         
         boolean anyAllergy=true;
         boolean pollenAllergy=false;
         
         String allergy="pollen";
         if(anyAllergy) {
        	 System.out.println("Let's check which allergies you have");
        	 if(pollenAllergy) {
        		 System.out.println("Do not get close to trees");
        	 }else {
        		 System.out.println("Ok you dont have any pollen allergy");
        	 }
         } else {
        	 System.out.println("You are lucky not having any allergies");
                  }
         
         
         
	}

}
