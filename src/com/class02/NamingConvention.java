package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		// keywords - a special word hat reserved in java memory: class, public, static, final, for
		
		// identifiers - name that we give to class, variable and methods
		
		/*
		 * rule!!! 
		 * 1. DO NOT USE KEYWORD AS IDENTIFIER
		 * 2. IDENTIFIERS CANNOT CONTAIN SPACE
		 * 3. IDENTIFIERS CANNOT START WITH NUMBERS
		 * 4. IDENTIFIERS CANNOT HAVE SPECIAL CHARACTERS: _ OR $
		 */
		
		// 1. int final=10;  Error : INVALID IDENTIFIER 
		
		// 2. byte variable one=12;
		
		// 3. short 1b=12;
		      short b1=12;
		      
		// 4. long *l=20000;
		      //long l*=20000;
		      
		      long _l=20000;
		      long long_=29990;
		      
		      double $price=12.99;
		      double price$=10.00;
		      
		      //NamingConvention
		          // 1. we use camel casing
		          // 2. classes starts with Upper cases and will follow camel casing
		          // 3. variable start with lower case and will follow camel casing
		          // 4. packages we use lower case and use name as resverse way of url
		          // 5. use meaningful name for your variables
		      
		      int Number=12; // try not to use uppercase names
		      int number=12; //more preferable
		      
		      int numberOne=12;
		      int numberTwo=13;
		      
		      boolean isSnow=true;
		      boolean snow=true;
		      
		      double applePrice=12.99;
		      double mangoPrice=13.89;

	}

}
