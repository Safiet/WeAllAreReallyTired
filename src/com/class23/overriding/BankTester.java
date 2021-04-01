package com.class23.overriding;

public class BankTester {
    public static void main(String[] args) {
        BankOfAmerica bankOfamerica=new BankOfAmerica();
        bankOfamerica.chargeTransferFee(1000);


        Chase chase=new Chase();
        chase.chargeTransferFee(1000);

        Citizen citizen=new Citizen();
        citizen.chargeTransferFee(1000);


    }
}
