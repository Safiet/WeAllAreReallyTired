package HomeWork;

public class NesetedForLoopExample {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern: Expected output:
		 * 
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6  
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2
		 * 1 
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 1 2 3 4 5 6  
		 * 1 2 3 4 5 6 7
		 * 
		 * 
		 */
		
		int a=8;
		  int b=1;
		  int c;
		  for(c=1;c<=7;c++){
		         a--;
		         for(b=1;b<=a;b++){
		              System.out.print(b+" ");
		             }System.out.println("");
		             }for(int w=2;w<=7;w++){
		              for(int q=1;q<=w;q++)
		             {System.out.print(q+" ");
		             }
		    System.out.println("");
		     }}    }