package com.class13;

public class Dogs {
	
	public String size;
	public String colour;
	public String breed;
	public String ages;
	public double age;
	public double price;
	
	public void sleep() {System.out.println("ZZZZZZZZZzzzzzzzzzz");}
	 
	public void bark() {System.out.println("ruf ruf");}
	
	 
	 public void eat() {System.out.println("Omnmonm");}
	
	 public void look() {System.out.println("Ho I am adog and my colour is "+colour);}
	 
	 
	 public static void main(String[] args) {
		
	 Dogs Dog3=new Dogs();
	 Dog3.bark();
     Dog3.eat();
     Dog3.sleep();
     Dog3.look();
     
     
     Dogs beagle=new Dogs();
     beagle.age=8;
     beagle.breed="beagle";
     beagle.size="large";
     beagle.colour="light grey";
     beagle.look();
     
     
	}
	
}
