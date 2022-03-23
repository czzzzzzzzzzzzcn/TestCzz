package com.czz.io.safe;

public class Test01 {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount(10000);
        MyThread t1 = new MyThread(myAccount);
        MyThread t2 = new MyThread(myAccount);
        t1.start();
        t2.start();
    }
}
