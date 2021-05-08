package com.class31.Task2;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("Credit Card"));
        linkedList.add(new DebitCard("Debit Card"));
        linkedList.add(new PrepaidCard("Prepaid Card"));
        for(Card card:linkedList){
            card.IssueCard();
            card.calculateInterest();

        }



    }
}
