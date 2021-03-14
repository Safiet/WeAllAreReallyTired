package com.class13;

public class Account {
String userName;
String password;
double balance;
String accountNumber;
boolean isLoggedIn;

public void login(String UserName,
		String Password) {
	if(userName.equals(UserName)&&password.equals(Password)) {
		System.out.println("Welcome to bank of America your balance is " + balance);
	}else {
		System.out.println("Useranme or password is not correct");
	}
}

public void printInfo() {
	if(isLoggedIn) {
	System.out.println("Your account number is " + accountNumber+" Your balance is "+balance);	
	}
}

public void printUserNameAndPassword(String UserName, String Password) 
{
	
		if(UserName.equals("Brian")) {
			System.out.println("Hi Bryan");
		}else {System.out.println("By bryan");}
	
}

}
