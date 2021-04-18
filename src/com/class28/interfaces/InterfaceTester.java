package com.class28.interfaces;

public class InterfaceTester {
    public static void main(String[] args) {
        // IParent iparent=new IParent();
        IParent iparent=new AdvanceChild();
        iparent.method1();
    }
}
