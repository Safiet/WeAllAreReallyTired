package com.class18;

public class TypesOfVar {
	
	String name;
	static String CompanyName="Syntax";
	void printInfo() {
		System.out.println(name+"Company "+CompanyName);
	}
	
	static void printCompanyInfo() {
		//System.out.println(name);
	System.out.println(CompanyName);
	}

	public static void main(String[] args) {
	
		TypesOfVar obj1=new TypesOfVar();
		obj1.name="Ram";
		TypesOfVar obj2=new TypesOfVar();
		obj2.name="Aiman";
		
		TypesOfVar.printCompanyInfo();

	}

}
