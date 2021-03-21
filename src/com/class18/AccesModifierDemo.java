package com.class18;

public class AccesModifierDemo {
public String name;
private String BankAccountPassword;
String SSNNumber;
public void park() {
	System.out.println("Everyone can go to a public park");
}
void car() {
	System.out.println("My little brother you can have my car please");
}
private void toothBrush() {
	System.out.println("No one should use it");
}

void printInfo() {
	System.out.println(name);
	System.out.println(BankAccountPassword);
	System.out.println(SSNNumber);
	
	toothBrush();
}
}
