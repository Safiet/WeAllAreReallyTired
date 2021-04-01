package HomeWork03232021.Task34;

public class Sample {
    static void printInfo(String name){
        System.out.println(name);
    }
     static void printInfo(String name, String adress){
        System.out.println(name+adress);
    }
    static void printInfo(String name, String adress, String phoneNumber){
        System.out.println(name+adress+phoneNumber);
    }

    public static void main(String[] args) {
        printInfo("MJ");
        printInfo("MJ","address123");
        printInfo("MJ","address123","124235235");

    }
}
