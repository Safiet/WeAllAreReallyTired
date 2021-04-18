package ReviewClass10.Encapsulation;

public class BankAccount {
    private double accountbalance=100000;
    private String password="123";

    public double getBalance(String password){
        if(this.password==password){
            return accountbalance;
            }else {return -1;}
    }
}
