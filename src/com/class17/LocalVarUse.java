package com.class17;

public class LocalVarUse {

	double sallary= 120000;
	
	void printInfo() {
		String name="Asgahr";
		System.out.println(name+" "+sallary);
	}
	void printSalaryPlusBonus() {
		double bonus=50000;
		System.out.println(sallary+bonus);
	}
	public static void main(String[] args) {
		
		
		
LocalVarUse obj=new LocalVarUse();
obj.printInfo();
obj.printSalaryPlusBonus();
	}

}
