package ReviewClass7.Methods;

public class MethodDemo3 {

    int sumTheOdds(int[] arr){
        int sum=0;
        for( int num:arr){
            if(num%2!=0){
                sum+=num;
            }
        }return sum;
    }
}