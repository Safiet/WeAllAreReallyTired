package com.class08;

public class breakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean rain=true;
		int temp=60;
		while(rain) {
			
			
		System.out.println("I will stay at home");
		if (temp>75) {
			System.out.println("I will walk under warm rain ");
			break;
		}	
		
		temp+=2;
		
		// System.out.println("I am a code inside whille loop"); CE: unreachable code
		
		}
		System.out.println("---------------------------------------");
	for(int i=1; i<=10; i++) {
		System.out.println(i);
		if (i==5) {
		break;
	}
		System.out.println("Im inside the loop");
	}
	}
    }
