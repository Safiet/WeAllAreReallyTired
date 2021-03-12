package com.class09;

public class NEstedFClock {

	public static void main(String[] args) {
		// clock

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m < 60; m++) {

				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":O" + m);

				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);

				} else if (h >= 10 && m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}
		System.out.println("----------------------------2 way to do it--------------");
		for (int a = 0; a <= 23; a++) {
			for (int b = 0; b < 6; b++) {
				for (int c = 0; c <= 9; c++) {
					if (a < 10) {
						System.out.println("0" + a + ":" + b + "" + c);
					} else
						System.out.println(a + ":" + b + "" + c);
				}
			}
		}System.out.println("----------------------3 wa to do it-------------------");
		
		for (int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				if(h<10) {
					if(m<10) {
						System.out.println("0" + h + ":O" + m);}
				else {
					System.out.println("0"+h + ":" + m);}
				}else {
				if(m<10) {
					
					System.out.println(h + ":0" + m);
				}else {
					System.out.println(h + ":" + m);
				}
			}
			
		}
	}
	}}
