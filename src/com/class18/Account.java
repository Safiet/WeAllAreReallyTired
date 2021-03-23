package com.class18;

public class Account {

	private double accountBalance;
	private String userName;
	private String password;

	public boolean login(String enteredUserName, String enteredPasswrd){
		return enteredUserName.equals(enteredPasswrd)&&enteredPasswrd.equals(password);
	}
	public boolean signUp(String enteredUserName,String enteredPasswrd,double enteredBalance){

		if(enteredUserName.length()>15){
			return false;}else{
			userName=enteredUserName;
			password=enteredPasswrd;
			accountBalance=enteredBalance;
			return true;
		}
		}
	  boolean transferFunds(String Password, double enteredAccountBalance) {
		if(Password.equals(password) && enteredAccountBalance<=accountBalance){
			accountBalance=accountBalance-enteredAccountBalance;
			return true;
		}else{
			return false;
		}}

	}
