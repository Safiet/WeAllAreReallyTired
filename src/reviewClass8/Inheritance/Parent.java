package reviewClass8.Inheritance;

public class Parent {
    private String bankAccount;
    public String Name;

    public Parent(String bankAccount, String name) {
        this.bankAccount = bankAccount;
        Name = name;

    }
    public void method1(){
    System.out.println("public method");
}
    protected void method2(){
        System.out.println("public method");
    }
    private void method3(){
        System.out.println("public method");
    }
    void method4() {
        System.out.println("public method");
    }}
class Child1 extends Parent{
        public Child1(String bankAccount,String name) {
            super(bankAccount,name);

    }
    @Override
    public void method2(){
      super.method2();
      this.method1();
      super.method1();
    }
}