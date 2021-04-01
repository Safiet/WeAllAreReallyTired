package HomewWork03312021.Task2;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard obj = new CreditCard();
        System.out.println(obj.calculateInteres(1000, 100));

        AX ax = new AX();
        System.out.println(ax.calculateInteres(1000, 100));

        Visa visa = new Visa();
        System.out.println(visa.calculateInteres(1000, 100));

    }


}
