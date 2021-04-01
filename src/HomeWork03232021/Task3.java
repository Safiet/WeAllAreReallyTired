package HomeWork03232021;


    /*
    Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
     1 - inside same class; 2 - from outside the class;
      3 - from different class inside different package  and observe result.
Write program that have static constructor and observe result.
     */

   import java.util.Scanner;
public class Task3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String mName, dName, gender, babyName;
            System.out.println("Enter mom's first name");
            mName = s.nextLine();
            System.out.println("Enter dad's first name");
            dName = s.nextLine();
            System.out.println("Are you expecting boy or girl?");
            gender = s.nextLine();
            if (gender.startsWith("b")) {
                babyName = (dName.substring(0, 3) + mName.substring(mName.length() / 2));
            } else if (gender.equalsIgnoreCase("girl")) {
                babyName = (mName.substring(0, mName.length() / 2) + dName.substring(dName.length() / 2));
            } else {
                babyName = "No suggestion";
            }
            System.out.println(babyName.toUpperCase());
        }
    }
