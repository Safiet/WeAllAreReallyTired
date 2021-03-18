package com.class15;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Accept userName, password and confirm password from a user and check following requirements:
		 * 
         *UserName and Password cannot be  empty, if so → message="UserName and Password cannot be empty".
         *Password should be minimum 8 characters, if less → message="Password is too short".
         *Password cannot contain userName if so, → message="Password cannot contain userName".
         *Password should match confirmed password, if not  → message="Passwords do not match".
         * Only after all requirements met → message "Your userName and password has been created"
		 */
		
		String userName="Saf123";
		String Password="kyky12412";
		String confirmPassword="kyky12412";
			
		if (userName.isEmpty() || Password.isEmpty()) {System.out.println("UserName and Password cannot be empty");}
		else if (Password.length()<8) {System.out.println("Password is too short");}
		else if(Password.contains(userName)) {System.out.println("Password cannot contain userName");}
		else if(!Password.equals(confirmPassword)) {System.out.println("Passwords do not match");}
      	     		
      	else{System.out.println("Your username and password has been created");  	}
			
		}
	}


