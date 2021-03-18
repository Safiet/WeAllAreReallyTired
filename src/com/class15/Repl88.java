package com.class15;

public class Repl88 {
String breed;
	 void bark(){System.out.println( breed+" can bark");};
	 void run() {System.out.println(breed+" can run");};
	 void play() {System.out.println(breed+" can play");};
	
	  public static void main(String[] args){
		 
		  
		  Repl88 behaviour=new Repl88();
	
	   			String[] breeds= {"Husky","Bulldog","Labrador"};	
			behaviour.breed=breeds[0];
			behaviour.bark();
			behaviour.run();
		    behaviour.play();
			behaviour.breed=breeds[1];
			behaviour.bark();
			behaviour.run();
		    behaviour.play();
			behaviour.breed=breeds[2];
			behaviour.bark();
			behaviour.run();
		    behaviour.play();
	
		
	

	




	  }
}
