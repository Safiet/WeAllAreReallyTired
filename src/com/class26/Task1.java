package com.class26;

public class Task1 {
    final int number;
    Task1(int number){
        this.number=number;
    }                        // we can initalazie variable only true constructor not a method!
/*
void init(int number){
        this.number=number;
}  ------> CE error because variable are final cant ghange
*/

    public static void main(String[] args) {
        final Task1 var1=new Task1(19);
        // var1=new Task1(20);  CE because we alreay tell htat it will be final

        final int[] a={10,20};
        //a={20,445} // -->Complier Error because it was final array
        a[1]=30; // you can change indexes if array is final but you cant change the array completely;
    }

}
