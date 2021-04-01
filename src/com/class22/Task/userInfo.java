package com.class22.Task;
public class userInfo extends UserClass {
    String address;

    userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;

    }

    void userDetails() {
        System.out.println("name "+name+" MobileNumber "+mobileNumber+" Address "+address);

    }
}



