package HomewWork03312021.Task2;

public class CreditCard {
    /*
     Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance
     Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
     Call the method by creating an object of each of the three classes
     */

    double balance = 0;
    double interest = 0;

    double calculateInteres(double balance, double interest) {
        return balance * interest;

    }


}
