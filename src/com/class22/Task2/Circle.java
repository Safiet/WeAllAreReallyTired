package com.class22.Task2;
//Write program: Shape class has a constructor that takes
// the radius and has a subclass as  circle class. In circle class create a method to calculate the area of circle. Test your code
public class Circle extends Shape {
    Circle(double radius){
        super(radius);
    }

void calculateArea(){
    System.out.println( "The radius of area is " +Math.pow(radius,2)*Math.PI); // ---->  System.out.println(radius*radius*3.14);
}

    public static void main(String[] args) {
        Circle obj=new Circle(2);
        obj.calculateArea();

    }
}
