package com.class17;

public class Students {
	 String studentName;
	    String studentID;
	   static int numberOfStudents;
	    
	     public static void main(String[] args) {
	    	
	        Students s=new Students();
	        s.studentID="Saf1";
	        s.studentName="Safiet";
	        numberOfStudents++;
	        Students s1=new Students();
	        s1.studentID="Alo2";
	        s1.studentName="Alona";
	        numberOfStudents++;
	        Students s3=new Students();
	        s3.studentID="Ede2";
	        s3.studentName="Edem";
	        numberOfStudents++;
	        System.out.println(numberOfStudents);
	    }
	
}
