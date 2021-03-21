package com.class17;

public class InstanceVariablesdemo {

	int number=10; // instance variables can be used anywhere inside the class;
	
	void printNumber() {
		System.out.println(number);
		String name="Asghar";
	}

	void printNumbers2() {
		System.out.println(number);
		//System.out.println(name); CE
	}
	public static void main(String[] args) {

		InstanceVariablesdemo obj=new InstanceVariablesdemo();
		System.out.println(obj.number);

	}

}
