package com.class28.encapsulation;

public class BankAccount {
    private String name;
    private  String userName;
    private String password;
    private double balance;

    public BankAccount(String name, String userName, String passwrod, double balance) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public void login(String userName,String passwrod){
        if(this.userName.equals(userName)&&this.password.equals(password)){
            System.out.println("Welcome to the bank");
        }else{
            System.out.println("something went wrong");
        }
    }
}
