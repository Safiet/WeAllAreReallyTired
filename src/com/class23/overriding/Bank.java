package com.class23.overriding;

public class Bank {

      void chargeTransferFee(double amount){
        System.out.println("Your Bank fee is "+amount*0.02);
        }
        }
   class BankOfAmerica extends Bank{
        public void chargeTransferFee(double amount){
        System.out.println("Your Bank of America fee is "+amount*0.05);
     }

  }
     class Chase extends Bank {
         void chargeTransferFee(double amount){
           System.out.println("Your Chase fee is "+amount*0.03);
     }

   }
      class Citizen extends Bank{

          }
