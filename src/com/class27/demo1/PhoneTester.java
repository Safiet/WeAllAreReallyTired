package com.class27.demo1;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone.unlockPhone();

        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();

        // Phone phone =new Phone(); ----->we are not allowed to create an objects because the class is incomplete

    }

}
