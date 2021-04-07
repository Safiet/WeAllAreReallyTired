package com.class25.Task;

public class StudentTester {
    public static void main(String[] args) {

        Student student1=new SchoolStudent();
        student1.eat();
        student1.study();
        Student student2=new SyntaxStudent();
        student2.eat();
        student2.study();
        Student student=new CollegeStudent();
        student.study();
        student.eat();
        CollegeStudent collegeStudent=(CollegeStudent)student;
        collegeStudent.fight();


    }
}
