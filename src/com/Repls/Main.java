package com.Repls;

public class Main {
         static class Person {
            String name;
            String lastName;
            int age;
            Person(String name, String lastName, int age) {
                this.name = name;
                this.lastName = lastName;
                this.age = age;
            }
        }
        static class Employee extends Person {
            int salary;

            Employee(String name, String lastName, int age,int salary) {
                super(name, lastName, age);
                this.salary = salary;
            }

            void method() {
                System.out.println(name + " " + lastName + " " + age + " " + salary);
            }
        }

        static class Student extends Employee {
            int grade;

            Student(String name, String lastName, int age, int grade) {
                super(name,lastName,age,grade);
               this.grade = grade;
            }

            void method() {
                System.out.println(name + " " + lastName + " " + age + " " + grade);
            }
        }

        static class Retiree extends Student {
            String seniorActivity;

            Retiree(String name, String lastName, int age, String seniorActivity) {
                super(name, lastName,age);
                this.seniorActivity = seniorActivity;
            }

            void method() {
                System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
            }
        }
        public static void main(String[] args) {
            Employee obj1 = new Employee("Joe", "Smith", 35,1000);
            obj1.method();
            Student obj2 = new Student("Adam", "Smith", 15,23421);
            obj2.method();
            Retiree obj3 = new Retiree("Frank", "Smith", 15, "tour");
            obj3.method();
        }}


