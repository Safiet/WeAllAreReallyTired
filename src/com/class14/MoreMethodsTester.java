package com.class14;

public class MoreMethodsTester {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MoreMethodExamples object=new MoreMethodExamples();

    System.out.println(object.print());
	System.out.println(object.doubleTheValue(10));
	object.isRaining(true);
	object.prints();
	System.out.println(object.returnGreater(122,56));
	object.method(11);
	
	double [] arr= {10.2,25,30,};
	
	System.out.println(object.returnTheArraySum(arr));
	
	System.out.println(object.Mirror("aba"));
	
	System.out.println(object.isMirror("aba"));
	System.out.println(object.isMirror("abaasfvzx"));
	
	
	



}
}