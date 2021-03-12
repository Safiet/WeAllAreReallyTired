package com.class07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------print numbers from 1-100-----------------");
		int num=0;
				while(num<100) {
					num++;
				System.out.print(num + " ");
	}
	
	System.out.println();
	System.out.println("-------------print numbers from 100-1------------------");
	int num2=100;
	while(num2>=1) {
	System.out.print(num2+ " ");
		num2--;
	}
	System.out.println();
	System.out.println("-------------print even from 20 to 100------------------");

  int num3=20;
 while(num3<=100) {
System.out.print(num3+" ");
	num3+=2; // to print even numbers use +=2;
}
 System.out.println();
	System.out.println("-------------print even from 20 to 100------------------");
 
 int a=20;
 while (a<=100) {
	 if(a%2==0) {
		 System.out.print(a+" ");
		 
	 }a++;
	 
 } System.out.println();
	System.out.println("------------------------------------------");
	 
int s=20;
while (s>=100) { // cant work
	 if(s%2==0) {
		 System.out.print(s+" ");
		 
	 }a++;
	 
	
}System.out.println("End of the code");
}
}
