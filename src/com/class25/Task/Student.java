package com.class25.Task;

public class Student {
    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
       Define common behavior within parent class and override some of the methods in child classes
       Define some methods specific to child classes
       Write example of achieving run time polymorphism
       */

    void eat(){
        System.out.println("Student can eat");
    }
    void study(){
        System.out.println("Student right now studying");
    }}
    class SyntaxStudent extends Student {
        @Override
        void eat(){
            System.out.println("SyntaxStudent eating now");
        }
        void study(){
            System.out.println("SyntaxStudent study");
        }
    }


    class CollegeStudent extends Student{
    @Override
    void eat(){
        System.out.println(" College student are eating now");
    }
        void study() {
            System.out.println("College student study");

        }        void fight(){
            System.out.println("Love to figth");
        }

        }
        class SchoolStudent extends Student{
@Override
void eat(){
    System.out.println("SchoolStudent eating now");
}
            void study(){
                System.out.println("SchoolStudent study");
        }
        }
