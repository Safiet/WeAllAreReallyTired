package HomeWork03232021;

public class Students {

        /*
        Write a java program of Class Students that takes students name and 3 subject grades.
         Inside your class also have a method to Calculate Average Grade.
          Test Student class for 5 different students with different marks.
           Your program should print an average mark of each students name.
           NOTE: please use different names for instance and local variables.
         */
        String name;
        double grade1;
        double grade2;
        double grade3;
        Students(String Name, double Grade1, double Grade2, double Grade3){
            name=Name;
            grade1=Grade1;
            grade2=Grade2;
            grade3=Grade3;
        }
        void printAverage(){
            double average=(grade1+grade2+grade3)/3;
            System.out.println("Average grade for "+name+" is "+average);
        }
        public static void main(String[] args) {
            Students s1=new Students("Safiet",78,68,67);
            s1.printAverage();
            Students s2=new Students("Edem",97,65,76);
            s2.printAverage();
            Students s3=new Students("Alona",99,47,97);
            s3.printAverage();
            Students s4=new Students("Evelina",49,57,89);
            s4.printAverage();
            Students s5=new Students("Marta",98,74,99);
            s5.printAverage();
        }



    }
