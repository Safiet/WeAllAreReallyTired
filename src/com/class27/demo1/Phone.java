package com.class27.demo1;

abstract class Phone{
    void makeCalls(){
        System.out.println("Calling");
    }
    void text(){
        System.out.println("Sending text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone uses Photos app to display pictures");

    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can unlock the phone by faceID");

    }
}
class Samsung extends Phone{
void makeCalls(){
    System.out.println("Calling from Samsung");
}

    @Override
    void unlockPhone() {
        System.out.println("Samsung users can unlock the phone by faceID and fingerprint");
    }
    @Override
    void displayPictures() {
        System.out.println("Samsung uses Photos app to display pictures");
    }

}

