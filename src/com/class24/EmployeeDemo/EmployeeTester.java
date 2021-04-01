package com.class24.EmployeeDemo;

import com.class24.EmployeeDemo.Contractor;
import com.class24.EmployeeDemo.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.salary=10000;
        employee.getPaid();
        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();

        // widering

        double var1=10;
        System.out.println(var1); //10.0
        int var2=(int)10.0;
        System.out.println(var2);
        //widening upcasting
        Employee contractor2=new Contractor();
      // narrowing down casting
        Contractor contractor3=(Contractor) new Employee();


    }
}
