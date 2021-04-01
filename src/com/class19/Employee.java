package com.class19;

public class Employee {
    String name;
    String empID;
    double sallary;
    String department;

Employee(){
    System.out.println("Important Line1 ");
    System.out.println("Important Line2 ");
    System.out.println("Important Line3 ");
    System.out.println("Important Line4 ");
    System.out.println("Important Line5 ");
}
    public Employee(String name) {
        //this.name=name;
        this();
        this.name=ValidateName(name);

}
public Employee(String name,String empID) {
        //this.name=name;
        this(name);
        this.empID=empID;

}
    public Employee(String name,String empID, double sallary) {
        /*this.name=name;
        this.name=ValidateName(name);
        this.empID=empID;*/
        this(name,empID);
        this.sallary=sallary;

    }
    public Employee(String name,String empID, double sallary,String department ) {
        /*this.name=name;
//        this.name=ValidateName(name);
//        this.empID=empID;
//        this.sallary=sallary;
------->      Instead of typing too much kust use  like that  this(name,empID,sallary);*/

        this(name,empID,sallary);

        this.department=department;
    }
    void printInfo(){
        System.out.println("Name "+ name+ "Employee id "+empID);
    }
    String ValidateName(String name){
        if(name.length()<15){
            return name;
        }else{
            return null;}
    }
}
