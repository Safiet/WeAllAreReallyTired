package com.class17;

public class Employee {

	 String empId;
		    double salary;
		    
		    static String CEO="Sumair";
		    
		    
		    public static void main(String[] args) {
		        Employee a=new Employee();
		        a.empId="293";
		        a.salary=28000;
		        System.out.println(a.empId+" "+a.salary+" "+CEO);
		        Employee e1=new Employee();
		        a.empId="1386";
		        a.salary=65000;
		        System.out.println(a.empId+" "+a.salary+" "+CEO);
		    }
		
}
