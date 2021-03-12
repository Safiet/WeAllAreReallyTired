package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
	// student Safiet
		
		String[][] values={
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
						};
		System.out.println(values[0][1]+" "+values[1][0]+", "+values[0][0]+" "+values[1][3]+", "+values[0][2]+" "+values[1][2]+", "+values[0][3]+" "+values[1][1]+".");
		
		System.out.println("-----------------------------2 task-------------------");
		
		String[][] name=new String[2][4];
		name[0][0]="Safiet";
		name[0][1]="Mirage";
		name[0][2]="Daryna";
		name[0][3]="Yulia";
		name[1][0]="A";
		name[1][1]="B";
		name[1][2]="C";
		name[1][3]="D";
		
		System.out.println(name[0][0]+" has grade "+name[1][0]+" and "+name[0][1]+" has grade "+name[1][1]);
		
		
		System.out.println("-------------------------another way--------------------");
		
		String [][]student= {{"Safiet", "Mirage", "Daryna", "Yulia"}, {"A","B","C","D"}};
		
		System.out.println(student[0][0]+" has grade "+student[1][0]+" and "+student[0][1]+" has grade "+student[1][1]);
		

}}
