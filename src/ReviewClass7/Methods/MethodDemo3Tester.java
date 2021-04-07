package ReviewClass7.Methods;

public class MethodDemo3Tester {
    public static void main(String[] args) {
        MethodDemo3 obj = new MethodDemo3();

        int[] numbers = {1, 2, 3, 4, 5};

        if (obj.sumTheOdds(numbers)>2){
            System.out.println("sum is greater than 2");
        }

    }
}
