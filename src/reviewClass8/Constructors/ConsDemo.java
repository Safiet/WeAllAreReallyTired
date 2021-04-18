package reviewClass8.Constructors;

public class ConsDemo {
    String name;
    public String address;

    public  ConsDemo() {
    }

    ConsDemo(String name) {
        this.name = name;
    }

    protected ConsDemo(String name, String address) {

    }

    void method1() {
        System.out.println("Method with default acces");
    }

    protected void method2() {
        System.out.println("Method with default acces");
    }

    private void method3() {
        System.out.println("Method with default acces");
    }

    public void method4() {
        System.out.println("Method with default acces");
    }

}
