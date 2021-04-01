package com.class22.task3;

import org.w3c.dom.css.Rect;

public class FirstClass {
    //Create 1 class in which create a methods that will calculate the area (volume) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
    double 	Length;
    double Width;
    double Higth;


  void Rectangle(double Length,double Width) {
this.Length=Length;
this.Width=Width;
double Rectangle = Length * Width;
      System.out.println("The area for Rectangle is "+Rectangle);
        }
        void Square(double Width){
           this.Width=Width;
      double Square=Width*Width;
            System.out.println("The area for Square is "+Square);

        }
        void Box(double Length,double Width,double Higth){
            this.Length=Length;
            this.Width=Width;
            this.Higth=Higth;
      double Box=2*Length*Width+2*Length*Higth+2*Higth*Width;
            System.out.println("The area for Box is "+Box);
        }


    }

