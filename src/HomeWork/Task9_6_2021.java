package HomeWork;

public class Task9_6_2021 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		int temp;
		int size;
	      
		int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;
	      
	      for(int i = 0; i<size; i++ ){
	      
	    	  for(int j = i+1; j<size; j++){
	          
	    		  if(array[i]>array[j]){
	              
	    			  temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	            	
	            }
	         }
	      
	      System.out.println("Second largest number is: "+array[size-2]);
	}
	

}
